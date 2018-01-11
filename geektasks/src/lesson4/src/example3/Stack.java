package lesson4.src.example3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;


public class Stack implements Queue{
   int arrayInt[] = {};

    @Override
    public int size() {
        return arrayInt.length;
    }

    @Override
    public boolean isEmpty() {
        if (arrayInt.length == 0) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean contains(Object o) {
        int newInt = (int) o;
        for(int i = 0 ;i < arrayInt.length ; i++){
            if (arrayInt[i] == newInt){
                return true;
            }
        }
        return false;
    }


    @Override
    public Iterator iterator() {
        Iterator it = new Iterator() {

            private int currentIndex = arrayInt.length-1;

            @Override
            public boolean hasNext() {
                return (currentIndex > 0) && (arrayInt[currentIndex] != -1);
            }

            @Override
            public Object next() {
                return arrayInt[currentIndex--];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        return it;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        int y =  (int) o;
        arrayInt = Arrays.copyOf(arrayInt, arrayInt.length+1);
        arrayInt[arrayInt.length-1] = y;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        int numberNumRemove = 0;
        int newInt =  (int) o;
        for (int i = 0;i < arrayInt.length; i++) {
            if (arrayInt[i] == newInt) {
                numberNumRemove = i;

                for (int j = numberNumRemove; j < arrayInt.length - 1; j++) {
                    System.out.println(numberNumRemove);
                    arrayInt[j] = arrayInt[j + 1];
                }
                arrayInt = Arrays.copyOf(arrayInt, arrayInt.length-1);
                return true;
            }
        }


        return false;
    }

    @Override
    public boolean addAll(Collection c) {

        return false;
    }

    @Override
    public void clear() {
        arrayInt = Arrays.copyOf(arrayInt, 0);

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        arrayInt = Arrays.copyOf(arrayInt, 0);
        return true;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public boolean offer(Object o) {
        arrayInt = Arrays.copyOf(arrayInt, arrayInt.length+1);
        arrayInt[arrayInt.length-1] = (int) o;
        return false;
    }

    @Override
    public Object remove() {
        return arrayInt[arrayInt.length-1];
    }

    @Override
    public Object poll() {
        int pollInt;
        pollInt = arrayInt[arrayInt.length-1];
        arrayInt = Arrays.copyOf(arrayInt, arrayInt.length-1);
        return pollInt;
    }

    @Override
    public Object element() {
        return arrayInt[0];
    }

    @Override
    public Object peek() {
        return arrayInt[arrayInt.length-1];
    }

    @Override
    public String toString() {
        for(int i =0 ;i<arrayInt.length;i++){
            System.out.printf("array[%d] = %d",i,arrayInt[i]);
            System.out.println();
        }
        return "true";
    }
}
