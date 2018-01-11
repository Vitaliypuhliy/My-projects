package leson2.src.factory;

import abstractClasses.Drivable;
import carClass.CUV;
import interfases.CarAbstractFactory;
import enumClass.DriveType;

public class FactoryCUV implements CarAbstractFactory {
    @Override
    public Drivable createDrivable() {

        return new CUV("cuv", 4, 5,
                4, 30, DriveType.FULL);


    }
}
