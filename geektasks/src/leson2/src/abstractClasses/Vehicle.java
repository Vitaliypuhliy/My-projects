package leson2.src.abstractClasses;
import enumClass.*;

public abstract class Vehicle extends Drivable {
    protected final int number_of_dors;
    public int size;
    protected final DriveType drive_type;

    protected Vehicle(String name, int number_of_wheel, int max_passengers, int number_of_dors, int size, DriveType drive_type) {
        super(name, number_of_wheel, max_passengers);
        this.number_of_dors = number_of_dors;
        this.size = size;
        this.drive_type = drive_type;

    }

    @Override
    public String toString() {
        return ("name = " + name + "  number_of_wheel=" + number_of_wheel + " max_passengers = " + max_passengers + " number_of_dors = " +
                number_of_dors + " size =" + size + " dribe_type = " + drive_type);
    }

}
