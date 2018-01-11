package lesson4.src.example5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Task3 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put(0,"obj0");
        hashMap.put(1,"obj1");
        hashMap.put(2,"obj2");
        hashMap.put(3,"obj3");
        hashMap.put(4,"obj4");
        hashMap.put(5,"obj5");
        hashMap.remove(0);
        hashMap.remove(3);
        hashMap.remove(5);
        hashMap.put(0,"obj0New");
        System.out.println(hashMap.containsKey(0));
        System.out.println(hashMap.containsKey(2));
        System.out.println(hashMap.containsKey(4));
        System.out.println(hashMap.containsValue("obj0New"));
        System.out.println(hashMap.containsValue("obj2"));
        System.out.println(hashMap.containsValue("obj4"));
        System.out.println(hashMap.toString());

        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(0,00);
        linkedHashMap.put(1,11);
        linkedHashMap.put(2,22);
        linkedHashMap.put(3,33);
        linkedHashMap.put(4,44);
        linkedHashMap.put(5,55);
        linkedHashMap.remove(0);
        linkedHashMap.remove(3);
        linkedHashMap.remove(5);
        linkedHashMap.put(0,0);
        System.out.println(linkedHashMap.containsValue(0));
        System.out.println(linkedHashMap.containsValue(33));
        System.out.println(linkedHashMap.containsValue(55));
        System.out.println(linkedHashMap.containsKey(0));
        System.out.println(linkedHashMap.containsKey(3));
        System.out.println(linkedHashMap.containsKey(5));
        System.out.println(linkedHashMap.toString());

        TreeMap treeMap = new TreeMap();
        treeMap.put(0,0);
        treeMap.put(1,1);
        treeMap.put(2,2);
        treeMap.put(3,3);
        treeMap.put(4,4);
        treeMap.put(5,5);
        treeMap.remove(0);
        treeMap.remove(3);
        treeMap.remove(5);
        System.out.println(treeMap.containsValue(0));
        System.out.println(treeMap.containsValue(3));
        System.out.println(treeMap.containsValue(5));
        System.out.println(treeMap.containsKey(0));
        System.out.println(treeMap.containsKey(3));
        System.out.println(treeMap.containsKey(5));
        System.out.println(treeMap.toString());

    }
}
