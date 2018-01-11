package lesson4.src.example1;

import java.util.HashMap;
import java.util.HashSet;
import example1.CatDemo;

public class CatCollectionDemo {
    public static void main(String[] args) {
        int rgb[] = {1,1,1};
        int rgb1[] = {1,12,1};
        int rgb2[] = {1,12,1};

        Cat cat = new Cat(rgb,8);
        Cat cat1 = new Cat(rgb,8);
        Cat cat2 = new Cat(rgb,4);
        Cat cat3 = new Cat(rgb,5);

        HashMap newmap = new HashMap();
        newmap.put(1, cat);
        newmap.put(2, cat2);
        newmap.put(3, cat3);
        System.out.println("Check if key 2 exists: " + newmap.containsKey(2));
        System.out.println("Check if value 'point' exists: " +
                newmap.containsValue(cat3));
        HashSet<Cat> newset = new HashSet <Cat>();
        newset.add(cat2);
        newset.add(cat1);
        newset.add(cat2);
        System.out.println("Is the element 'Simply' exists: "+ newset.contains(cat));
    }
}
