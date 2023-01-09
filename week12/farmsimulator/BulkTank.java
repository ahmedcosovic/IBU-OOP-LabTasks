package farmsimulator;

public class BulkTank {
    private double capacity=2000;
    private double volume=0;

    public BulkTank(){}

    public BulkTank(double capacity){
        this.capacity=capacity;
    }

    public double getCapacity(){
        return this.capacity;
    }

    public double getVolume(){
        return this.volume;
    }

    public double howMuchFreeSpace(){
        double space=this.capacity-this.volume;
        return space;
    }

    public void addToTank(double amount){
        this.volume+=amount;
        if(this.volume>this.capacity){
            this.volume=this.capacity;
        }
    }

    public double getFromTank(double amount){
        if(amount<=this.volume){
            this.volume-=amount;
            return amount;
        }
        else {
            double temp=this.volume;
            this.volume=0;
            return temp;
        }
    }

    public String toString(){
        return this.volume+"/"+this.capacity;
    }
}
