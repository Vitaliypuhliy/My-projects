package leson2.src.partOfDrivable;

import interfases.StatusAware;

public class Horn implements StatusAware {
    @Override
    public String status(boolean iswork) {
        if (iswork)
            return "beeeeeeep!!";
        else
            return "no beeeeeep";

    }
}
