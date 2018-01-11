package leson2.src.factory;

import abstractClasses.Drivable;
import carClass.*;
import enumClass.*;

import interfases.CarAbstractFactory;

public class FactoryCoupe implements CarAbstractFactory {
    @Override
    public Drivable createDrivable() {

            return new Coupe("coupe", 4, 5,
                    4, 30, DriveType.FRONT);

    }
}