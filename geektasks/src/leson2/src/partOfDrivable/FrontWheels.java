package leson2.src.partOfDrivable;

import interfases.Retarding;
import interfases.Steared;

public class FrontWheels implements Retarding, Steared {
    int numberOfWheel;

    public FrontWheels(int numberOfWheel) {
        this.numberOfWheel = numberOfWheel;

    }

    @Override
    public String retarDing(boolean isbreake, int speed) {
        if (isbreake) {
            while (speed > 0) {
                speed--;
                System.out.println(speed);
            }
            return "Frontwheel stoping";
        } else {
            return "Frontwheel not stoping";
        }
    }

    @Override
    public String steared(boolean rotation) {
        if (rotation) {
            return "right";
        } else {
            return "left";
        }
    }
}
