package lesson11.src.com.geekhub.javalessons.task2;


import jdk.nashorn.internal.ir.annotations.Ignore;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class User implements ChangeSetExtractor<User> {

    private int id;
    private String name;
    @Ignore
    private int age;
    private Dog dog;

    public User(int id, String name, int age, Dog dog) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dog = dog;
    }

    @Override
    public ChangeSet extract(User oldObject, User newObject)  {
        if (!canExtract()) {
            throw new RuntimeException("cant extract");
        }
        ChangeSet changeSet = new ChangeSet();
        List<Field> fieldList = returnListFields(oldObject);

        for (Field f : fieldList) {
            f.setAccessible(true);
            try {
                if (!f.get(oldObject).equals(f.get(newObject))) {
                    changeSet.addToChangeSet("  old is - " + f.get(oldObject) +
                            "  new is " + f.get(newObject));
                }

            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        return changeSet;
    }

    private boolean canExtract() {
        Class[] userInterfaces = User.class.getInterfaces();
        for (Class c : userInterfaces) {
            if (c.equals(ChangeSetExtractor.class)) {
                return true;
            }
        }
        return false;
    }

    private List<Field> returnListFields(User u) {
        List<Field> list = new ArrayList<>();
        for (Field field : u.getClass().getDeclaredFields()) {
            if (!field.isAnnotationPresent(Ignore.class)) {
                list.add(field);
            }
        }
        return list;
    }

}
