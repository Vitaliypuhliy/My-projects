package lesson4.src.example1;

import java.util.*;

public class CatDemo {
    public static void main(String[] args) {
        int rgb[] = {1,1,1};
        int rgb1[] = {1,12,1};
        int rgb2[] = {1,12,1};

        Cat cat = new Cat(rgb,8);
        Cat cat1 = new Cat(rgb,8);
        Cat cat2 = new Cat(rgb,4);

        System.out.println(cat.equals(cat1));
        System.out.println(cat.hashCode());
        System.out.println(cat2.hashCode());
        System.out.println(cat2.toString());

    }
}
