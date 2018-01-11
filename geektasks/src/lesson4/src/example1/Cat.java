package lesson4.src.example1;

import java.util.Arrays;

public class Cat {
    public int[] rgbColor = new int[3];
    public int age;

    public Cat(int[] rgbColor, int age) {
        this.rgbColor = rgbColor;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        if (age != cat.age) return false;
        return Arrays.equals(rgbColor, cat.rgbColor);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(rgbColor);
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "rgbColor=" + Arrays.toString(rgbColor) +
                ", age=" + age +
                '}';
    }
}
