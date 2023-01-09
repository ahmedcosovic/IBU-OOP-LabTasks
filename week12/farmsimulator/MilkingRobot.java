package farmsimulator;

public class MilkingRobot {

    private BulkTank tank = null;

    public MilkingRobot(){
    }

    public BulkTank getBulkTank(){
        return this.tank;
    }

    public void setBulkTank(BulkTank tank){
        this.tank=tank;
    }

    public void milk(Milkable milkable) throws IllegalStateException {
        double value = milkable.milk();
        this.tank.addToTank(value);
    }
}
