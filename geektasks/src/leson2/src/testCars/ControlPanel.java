package leson2.src.testCars;

import abstractClasses.Drivable;


public class ControlPanel {

    public void switchOn(Drivable drivable) {
        drivable.getEngine().status(true);
    }

    public void accelerate(Drivable drivable) {
        drivable.getAccelerator().status(true);
    }

    public void GasTankVolume(Drivable drivable) {
        System.out.println(" volume of gastabk = " + drivable.getGasTank());
    }

    public void breakes(Drivable drivable) {
        System.out.println("breakes :" + drivable.getFrontWheels().retarDing(true, 4));
    }

    public void slowDown(Drivable drivable) {
        System.out.println("no brakest");
    }

    public void getEngine(Drivable drivable) {
        System.out.println("engeene type = " + drivable.getEngine().getEngineType());
    }
    public void handBraeke(Drivable drivable){
        System.out.println("breakes work" + drivable.getHandBreake());
    }


}


