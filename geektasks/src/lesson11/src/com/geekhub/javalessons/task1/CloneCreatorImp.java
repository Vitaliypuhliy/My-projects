package lesson11.src.com.geekhub.javalessons.task1;

import jdk.nashorn.internal.ir.annotations.Ignore;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class CloneCreatorImp implements CloneCreator<UserForClone> {
    @Override
    public UserForClone clone(UserForClone object) {
        UserForClone userForClone = new UserForClone();
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field f : fields) {
            f.setAccessible(true);
                if (!(f.getAnnotatedType().getClass()).equals(Ignore.class)) {
                    try {

                        Object o = f.get(object);
                        f.set(userForClone, f.get(object));
                        System.out.println(o);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
        }
        return userForClone;
    }
}
