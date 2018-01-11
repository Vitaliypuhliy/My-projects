package lesson4.src.example5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Task1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("first");
        list.add("second");
        list.add("thrird");
        list.add("fourth");
        list.add(0,"zero");
        list.add(2,"middle");
        list.add(6,"last");
        System.out.println(list);
        list.remove("zero");
        list.remove("middle");
        list.remove("last");
        System.out.println(list);
        list.set(0,"zero");
        list.set(2,"middle");
        list.set(3,"last");
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(2));
        System.out.println(list.get(3));

        Vector vector = new Vector();
        vector.add("first");
        vector.add(0,"first1");
        vector.add(1,"second");
        vector.add(2,"third");
        vector.add(3,"last");
        vector.add(4,"fourth");
        vector.remove(0);
        vector.remove(2);
        vector.remove(1);
        System.out.println(vector);
        vector.set(0,"first");
        vector.set(1,"second");
        vector.set(2,"third");
        System.out.println(vector);
        System.out.println(vector.get(0));
        System.out.println(vector.get(1));
        System.out.println(vector.get(2));


        LinkedList linkedList = new LinkedList();

        linkedList.add("first");
        linkedList.add(0,"first1");
        linkedList.add(1,"second");
        linkedList.add(2,"third");
        linkedList.add(3,"last");
        linkedList.add(4,"fourth");
        linkedList.remove(0);
        linkedList.remove(2);
        linkedList.remove(1);
        System.out.println(linkedList);
        linkedList.set(0,"first");
        linkedList.set(1,"second");
        linkedList.set(2,"third");
        System.out.println(linkedList);
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(2));

    }

}
