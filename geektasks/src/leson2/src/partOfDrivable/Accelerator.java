package leson2.src.partOfDrivable;

import interfases.StatusAware;

public class Accelerator implements StatusAware {
    public int speed = 0;

    public Accelerator(int speed) {
        this.speed = speed;
    }

    @Override
    public String status(boolean iswork) {
        if (iswork) {
            while (this.speed < 15) {
                this.speed++;
                System.out.println("\n" + this.speed);
            }
            return "working";
        } else {
            return "no working";
        }

    }
}
