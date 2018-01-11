package leson2.src.partOfDrivable;
import enumClass.EngineType;
import interfases.StatusAware;

public class Engine implements StatusAware {
    protected int powerfull = 10;
    private EngineType engineType;

    public Engine(int powerfull,EngineType engineType) {
        this.engineType = engineType;
        this.powerfull = powerfull;
    }

    @Override
    public String status(boolean iswork) {
        if (iswork)
            return "working";
        else
            return "no working";
    }

    public EngineType getEngineType() {
        return engineType;
    }
}
