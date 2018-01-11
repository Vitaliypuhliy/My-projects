package lesson5.src.Ex1;


import java.util.ArrayList;
import java.util.Collection;
import java.io.*;
import java.util.Collections;

public class CarTest {
    public static void main(String[] args) {
        ArrayList<Car> arrayList = new ArrayList<>();
        Car car1 = new Car("ca", 4, "rlue");
        Car car2 = new Car("b", 4, "alue");
        Car car3 = new Car("a", 6, "ilue");
        Car car5 = new Car("a", 100, "ilue");
        Car car4 = new Car("d", 7, "clue");
        arrayList.add(car1);
        arrayList.add(car2);
        arrayList.add(car3);
        arrayList.add(car4);
        arrayList.add(car5);
        for (Car e : arrayList) {
            System.out.println(e.getBrand() + " " + e.getLength() + " " + e.getColor());
        }
        Collections.sort(arrayList,new CarComparator());
        for (Car e : arrayList) {
            System.out.println(e.getBrand() + " " + e.getLength() + " " + e.getColor());
        }
    }
}
