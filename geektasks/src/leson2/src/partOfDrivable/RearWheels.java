package leson2.src.partOfDrivable;

import interfases.Retarding;

public class RearWheels implements Retarding {
    int numberOfWheel;

    public RearWheels(int numberOfWheel) {
        this.numberOfWheel = numberOfWheel;

    }

    @Override
    public String retarDing(boolean isbreake, int speed) {
        if (isbreake) {
            while (speed > 0) {
                speed--;
                System.out.println(speed);
            }
            return "RearWheels stoping";
        } else {
            return "RearWheels not stoping";
        }
    }
}
