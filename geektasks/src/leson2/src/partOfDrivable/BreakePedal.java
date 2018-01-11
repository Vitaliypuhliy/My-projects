package leson2.src.partOfDrivable;

import interfases.StatusAware;

public class BreakePedal implements StatusAware {
    public int speed = 0;

    public BreakePedal(int speed) {

        this.speed = speed;
    }

    @Override
    public String status(boolean iswork) {
        if (iswork) {
            while (this.speed > 0) {
                this.speed -= 2;
                System.out.println("\n" + this.speed);
            }
            return "working";
        } else {
            return "no working";
        }

    }
}
