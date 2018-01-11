package leson2.src.carClass;

import abstractClasses.Vehicle;
import enumClass.DriveType;
public class Hatchback3Doors extends Vehicle {

    public Hatchback3Doors(String name, int number_of_wheel, int max_passengers, int number_of_dors, int size, DriveType drive_type) {
        super(name, number_of_wheel, max_passengers, number_of_dors, size, drive_type);
    }
}
