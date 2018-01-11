package leson2.src.partOfDrivable;

import interfases.StatusAware;

public class GasTank implements StatusAware {
    private int sizeOf;
    public GasTank(int sizeOf){
        this.sizeOf = sizeOf;
    }

    @Override
    public String status(boolean iswork) {
        if (iswork)
            return "have a fuel";
        else
            return "no fuel";

    }

}
