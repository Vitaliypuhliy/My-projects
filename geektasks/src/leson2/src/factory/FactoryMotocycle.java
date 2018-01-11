package leson2.src.factory;

import abstractClasses.Drivable;
import carClass.Motorcycle;
import interfases.CarAbstractFactory;

public class FactoryMotocycle implements CarAbstractFactory {
    @Override
    public Drivable createDrivable() {

        return new Motorcycle("motocycle", 2, 1);

    }
}
