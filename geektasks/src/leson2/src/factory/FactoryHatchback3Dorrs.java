package leson2.src.factory;

import abstractClasses.Drivable;
import carClass.Hatchback3Doors;
import enumClass.DriveType;
import interfases.CarAbstractFactory;

public class FactoryHatchback3Dorrs implements CarAbstractFactory {
    @Override
    public Drivable createDrivable() {

        return new Hatchback3Doors("Hatchback3Doors", 3,
                5, 3, 30, DriveType.FULL);


    }
}
