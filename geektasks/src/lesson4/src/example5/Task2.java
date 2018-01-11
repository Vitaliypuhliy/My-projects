package lesson4.src.example5;

import example4.SetOperations;

import java.util.*;


public class Task2 {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add("R");
        treeSet.add("G");
        treeSet.add("B");
        treeSet.remove("G");
        System.out.println(treeSet.contains("R"));
        HashSet hashSet = new HashSet();
        hashSet.add("a");
        hashSet.add("b");
        hashSet.add("c");
        hashSet.remove("a");
        System.out.println(hashSet.contains("b"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(hashSet);
        linkedHashSet.add("q");
        linkedHashSet.toString();
        System.out.println(linkedHashSet.contains("q"));
        System.out.println(linkedHashSet.remove("q"));
        System.out.println(linkedHashSet.toString());
        System.out.println(hashSet.toString());
        System.out.println(treeSet.toString());


    }
}
