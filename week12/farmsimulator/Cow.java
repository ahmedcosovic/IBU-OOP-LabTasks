package farmsimulator;

import java.util.Random;

public class Cow implements Milkable, Alive{

    private String name;
    private Random rand = new Random();
    private double capacity=15+rand.nextInt(26);
    private double amount;

    private static final String[] NAMES = new String[]{"Anu", "Arpa", "Essi", "Heluna", "Hely",  "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",  "Jaana", "Jami", "Jatta", "Laku", "Liekki",  "Mainikki", "Mella", "Mimmi", "Naatti", "Nina", "Nyytti", "Papu", "Pullukka", "Pulu", "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    public Cow(){
        int randomIndex = new Random().nextInt(NAMES.length);
        this.name=NAMES[randomIndex];
    }

    public Cow(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public double getCapacity(){
        return this.capacity;
    }

    public double getAmount(){
        return this.amount;
    }

    public String toString(){
        return this.name+" "+this.getAmount()+"/"+this.getCapacity();
    }

    @Override
    public void liveHour() {
        Random rand = new Random();
        this.amount+=0.7 + (2 - 0.7) * rand.nextDouble();
    }

    @Override
    public double milk() {
        double temp = this.amount;
        this.amount=0;
        return temp;
    }
}
