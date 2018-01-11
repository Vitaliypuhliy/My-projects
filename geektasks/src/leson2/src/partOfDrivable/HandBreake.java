package leson2.src.partOfDrivable;

import interfases.StatusAware;

public class HandBreake implements StatusAware {
    public int speed = 0;

    public HandBreake(int speed) {

        this.speed = speed;
    }

    @Override
    public String status(boolean iswork) {
        if (iswork) {
            while (speed > 0) {
                speed--;
                System.out.println("\n" + speed);
            }
            return "working";
        } else {
            return "no working";
        }

    }
}
