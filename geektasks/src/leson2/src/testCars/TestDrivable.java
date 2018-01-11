package leson2.src.testCars;


import abstractClasses.Drivable;
import factory.*;
import interfases.CarAbstractFactory;

public class TestDrivable {
    public static void main(String argc[]) {
        ControlPanel panel = new ControlPanel();
        for (CarAbstractFactory factory : factories()) {
            Drivable drivable = factory.createDrivable();
            System.out.println("Test Drive: " + drivable.getName());


            panel.switchOn(drivable);
            panel.slowDown(drivable);
            panel.accelerate(drivable);
            panel.getEngine(drivable);
            panel.breakes(drivable);
            panel.GasTankVolume(drivable);
            panel.handBraeke(drivable);
            System.out.println("Test Drive Successfully Finished.");
        }

    }

    private static CarAbstractFactory[] factories() {
        return new CarAbstractFactory[]{
                new FactorySedan(),
                new FactoryCUV(),
                new FactoryHatchback3Dorrs(),
                new FactoryHatchback5Doors(),
                new FactoryCoupe(),
                new FactoryMotocycle()

        };

    }
}