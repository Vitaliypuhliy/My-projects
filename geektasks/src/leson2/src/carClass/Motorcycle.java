package leson2.src.carClass;

import abstractClasses.Drivable;
import partOfDrivable.FrontWheels;
import partOfDrivable.RearWheels;


public class Motorcycle extends Drivable {
    public RearWheels rearWheels = new RearWheels(1);
    public FrontWheels frontWheels = new FrontWheels(1);

    public Motorcycle(String name, int number_of_wheel, int max_passengers) {
        super(name, number_of_wheel, max_passengers);
    }
}
