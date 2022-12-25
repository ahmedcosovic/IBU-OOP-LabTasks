public class Book2 implements ToBeStored{
    private String writer;
    private String name;
    private double weight;

    public Book2(String writer, String name, double weight){
        this.writer=writer;
        this.name=name;
        this.weight=weight;
    }

    public String toString(){
        return this.writer+": "+this.name;
    }

    @Override
    public double weight() {
        return this.weight;
    }
}
