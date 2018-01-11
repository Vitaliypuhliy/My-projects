package lesson11.src.com.geekhub.javalessons.task1;

import com.geekhub.javalessons.task2.Dog;
import jdk.nashorn.internal.ir.annotations.Ignore;
import java.util.Objects;

public class UserForClone implements CanBeCloned {
    private String name;
    private Dog dog;
    private int age;
    @Ignore
    private boolean isAdult;

    public UserForClone() {

    }

    public UserForClone(String name, Dog dog, int age, boolean isAdult) {
        this.name = name;
        this.dog = dog;
        this.age = age;
        this.isAdult = isAdult;
    }

    @Override
    public String toString() {
        return "UserForClone{" +
                "name='" + name + '\'' +
                ", dog=" + dog +
                ", age=" + age +
                ", isAdult=" + isAdult +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserForClone that = (UserForClone) o;
        return age == that.age &&
                isAdult == that.isAdult &&
                Objects.equals(name, that.name) &&
                Objects.equals(dog, that.dog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dog, age, isAdult);
    }
}
