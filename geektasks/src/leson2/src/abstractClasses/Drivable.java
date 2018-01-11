package leson2.src.abstractClasses;

import enumClass.EngineType;
import partOfDrivable.*;

public abstract class Drivable {
    protected Accelerator accelerator = new Accelerator(4);
    protected BreakePedal breakePedal = new BreakePedal(3);
    public Engine engine = new Engine(7, EngineType.GAS);
    protected FrontWheels frontWheels = new FrontWheels(2);
    protected GasTank gasTank = new GasTank(9);
    protected HandBreake handBreake = new HandBreake(150);
    protected Horn horn = new Horn();
    protected RearWheels rearWheels = new RearWheels(2);
    protected String name;
    protected int number_of_wheel;
    protected int max_passengers;

    protected Drivable(String name, int number_of_wheel, int max_passengers) {
        this.name = name;
        this.number_of_wheel = number_of_wheel;
        this.max_passengers = max_passengers;
    }

    @Override
    public String toString() {
        return ("name = " + name + "  number_of_wheel=" + number_of_wheel + " max_passengers = " + max_passengers);
    }

    public Accelerator getAccelerator() {
        return accelerator;
    }

    public FrontWheels getFrontWheels() {
        return frontWheels;
    }

    public GasTank getGasTank() {
        return gasTank;
    }

    public BreakePedal getBreakePedal() {
        return breakePedal;
    }

    public HandBreake getHandBreake() {
        return handBreake;
    }

    public Horn getHorn() {
        return horn;
    }

    public RearWheels getRearWheels() {
        return rearWheels;
    }

    public String getName() {
        return name;
    }

    public int getNumber_of_wheel() {
        return number_of_wheel;
    }

    public int getMax_passengers() {
        return max_passengers;
    }


    public Engine getEngine() {
        return engine;
    }


}
