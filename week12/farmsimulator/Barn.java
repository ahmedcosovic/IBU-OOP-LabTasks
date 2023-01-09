package farmsimulator;

import java.util.ArrayList;
import java.util.Collection;

public class Barn {
    private MilkingRobot milkingRobot = null;

    private BulkTank tank;

    public Barn(BulkTank tank) throws IllegalStateException{
        this.tank=tank;
    }

    public BulkTank getBulkTank(){
        return this.tank;
    }

    public void installMilkingRobot(MilkingRobot milkingRobot){
        this.milkingRobot=milkingRobot;
        this.milkingRobot.setBulkTank(this.tank);
    }

    public void takeCareOf(Cow cow) throws IllegalStateException {
        this.milkingRobot.milk(cow);
    }

    public void takeCareOf(Collection<Cow> cows) throws IllegalStateException {
        for(Cow cow: cows){
            this.milkingRobot.milk(cow);
        }
    }

    public String toString(){
        return this.tank.getVolume()+"/"+this.tank.getCapacity();
    }
}
