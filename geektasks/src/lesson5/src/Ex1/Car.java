package lesson5.src.Ex1;

import java.util.Comparator;

public class Car {
    private String brand;
    private int length;
    private String color;

    public Car(String brand, int length, String color) {
        this.brand = brand;
        this.length = length;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public int getLength() {
        return length;
    }

    public String getColor() {
        return color;
    }
}

class CarComparator implements Comparator<Car> {




    @Override
    public int compare(Car o1, Car o2) {
        if (isEqualsBrand(o1, o2) && isEqualsColor(o1, o2) && isEqualsLength(o1, o2)) {
            return 0;
        } else if (isEqualsBrand(o1, o2) && isEqualsColor(o1, o2) && !isEqualsLength(o1, o2)) {
            return o2.getLength() - o1.getLength();
        } else if (isEqualsBrand(o1, o2) && !isEqualsColor(o1, o2) && isEqualsLength(o1, o2)) {
            return o1.getColor().compareTo(o2.getColor());
        } else if (!isEqualsBrand(o1, o2) && isEqualsColor(o1, o2) && isEqualsLength(o1, o2)) {
            return o1.getBrand().compareTo(o2.getBrand());
        } else if (!isEqualsBrand(o1, o2) && !isEqualsColor(o1, o2) && isEqualsLength(o1, o2)) {
            return o1.getBrand().compareTo(o2.getBrand());
        } else if (!isEqualsBrand(o1, o2) && isEqualsColor(o1, o2) && !isEqualsLength(o1, o2)) {
            return o1.getBrand().compareTo(o2.getBrand());
        } else if (isEqualsBrand(o1, o2) && !isEqualsColor(o1, o2) && !isEqualsLength(o1, o2)) {
            return o1.getColor().compareTo(o2.getColor());
        }

        return o1.getBrand().compareTo(o2.getBrand());
    }

    private boolean isEqualsLength(Car o1, Car o2) {
        return o1.getLength() == o2.getLength();
    }

    private boolean isEqualsColor(Car o1, Car o2) {
        return o1.getColor().equals(o2.getColor());
    }

    private boolean isEqualsBrand(Car o1, Car o2) {
        return o1.getBrand().equals(o2.getBrand());
    }

}
