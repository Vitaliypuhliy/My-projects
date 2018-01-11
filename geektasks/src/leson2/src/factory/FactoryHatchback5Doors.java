package leson2.src.factory;

import abstractClasses.Drivable;
import enumClass.DriveType;
import carClass.Hatchback5Dorrs;
import interfases.CarAbstractFactory;

public class FactoryHatchback5Doors implements CarAbstractFactory {
    @Override
    public Drivable createDrivable() {

        return new Hatchback5Dorrs("Hatchback5Dorrs", 4,
                5, 5, 30, DriveType.FULL);


    }
}
