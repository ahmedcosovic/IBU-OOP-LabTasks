package farmsimulator;

public class FarmMain {
    public static void main(String[] args) {
        Farm farm = new Farm("Esko", new Barn(new BulkTank()));
        //System.out.println(farm);
        //System.out.println(farm.getOwner()+" is a tough guy!");

        farm.addCow(new Cow());
        farm.addCow(new Cow());
        farm.addCow(new Cow());

        farm.liveHour();
        farm.liveHour();
        System.out.println(farm);
    }
}
