package leson2.src.factory;

import abstractClasses.Drivable;
import carClass.Sedan;
import interfases.CarAbstractFactory;
import enumClass.DriveType;

public class FactorySedan implements CarAbstractFactory {
    @Override
    public Drivable createDrivable() {

        return new Sedan("sedan", 4, 5,
                4, 30, DriveType.REAR);


    }
}
