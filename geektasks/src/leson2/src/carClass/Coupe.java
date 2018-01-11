package leson2.src.carClass;

import abstractClasses.Vehicle;
import enumClass.*;
import partOfDrivable.Engine;


public class Coupe extends Vehicle {
    protected Engine engine = new Engine(7, EngineType.DIESEL);

    public Coupe(String name, int number_of_wheel, int max_passengers, int number_of_dors, int size, DriveType driveType) {
        super(name, number_of_wheel, max_passengers,number_of_dors,size, driveType);
    }
}
