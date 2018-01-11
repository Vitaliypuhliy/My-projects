package lesson4.src.example4;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        ImplemetSetOperation implemetSetOperation = new ImplemetSetOperation();
        HashSet hashSet1 = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet3.add(2);
        hashSet3.add(3);
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                hashSet1.add(i);
            } else {
                hashSet2.add(i);
            }
        }
        print(implemetSetOperation,hashSet1,hashSet2,hashSet3);
    }
    public static void print(ImplemetSetOperation implemetSetOperation,HashSet hashSet1,
                        HashSet hashSet2,HashSet hashSet3){
        System.out.println(implemetSetOperation.equals(hashSet1, hashSet2));
        System.out.println(implemetSetOperation.equals(hashSet1, hashSet3));
        System.out.println(implemetSetOperation.equals(hashSet1, hashSet1));
        System.out.println(implemetSetOperation.equals(hashSet2, hashSet2));
        System.out.println(hashSet1.toString());
        System.out.println(hashSet2.toString());
        System.out.println(hashSet3.toString());
        System.out.println(implemetSetOperation.union(hashSet1, hashSet2));
        System.out.println(implemetSetOperation.union(null, hashSet2));
        System.out.println(implemetSetOperation.subtract(hashSet2, hashSet3));
        System.out.println(implemetSetOperation.intersect(hashSet2, hashSet3));
        System.out.println(implemetSetOperation.symmetricSubtract(hashSet2, hashSet3));
    }
}

