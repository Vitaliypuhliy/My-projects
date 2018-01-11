package lesson4.src.example2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class VoteBox implements Collection{
    String array[] = {};

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public boolean isEmpty() {
        if (array.length == 0) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean contains(Object o) {
        for (Object object:array){
            if (object.equals(o)) {
                return true;
            } else {
                return false;
            }
        }

        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return array;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        if (o.equals("YesName")) {
            this.array = Arrays.copyOf(array, array.length+2);
            array[array.length-1] = "YesName";
            array[array.length-2] = "YesName";
            return true;
        }
        if(o.equals("NoName")){
            return false;
        }else{
            this.array = Arrays.copyOf(array, array.length+1);
            String name = (String) o;
            array[array.length-1] = name;
            return true;
        }
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        if (c.isEmpty() && array.length != 0) {
            Object[] arrayC = c.toArray();
            for (int i = array.length - 1; i < arrayC.length - 1; i++) {
                array[i] = (String) arrayC[i];
            }
            return true;
        }else {
            return false;
        }


    }

    @Override
    public void clear() {
        array = Arrays.copyOf(array, 0);
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        this.array = Arrays.copyOf(array, 0);
        return true;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }


    @Override
    public String toString() {
        for(Object element : array) {
            System.out.println(element);
        }
        return "";
    }
}
