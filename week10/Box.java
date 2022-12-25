import java.util.ArrayList;

public class Box implements ToBeStored{
    private double maxWeight;
    private double currentWeight=0;
    ArrayList<Book2> knjige = new ArrayList<Book2>();
    ArrayList<CD> diskovi = new ArrayList<CD>();
    public Box(double maxWeight){
        this.maxWeight=maxWeight;
    }

    public void add(Book2 knjiga){
        if(this.currentWeight+knjiga.weight()<this.maxWeight){
            this.knjige.add(knjiga);
            this.currentWeight+=knjiga.weight();
        }
    }

    public void add(CD disk){
        if(this.currentWeight+disk.weight()<this.maxWeight){
            this.diskovi.add(disk);
            this.currentWeight+=disk.weight();
        }
    }

    private int brojStvari(){
        return this.knjige.size()+this.diskovi.size();
    }

    public String toString(){
        return "Box: "+this.brojStvari()+" things, total weight "+this.currentWeight+" kg";
    }
    @Override
    public double weight() {
        return 0;
    }
}
