package boxes;

public class Thing{
    private String name;
    private int weight;

    public Thing(String name){
        this.name=name;
        this.weight=0;
    }

    public Thing(String name, int weight) throws IllegalStateException{
        this.name=name;
        IllegalStateException ise = new IllegalStateException();
        if(weight<0)
            throw ise;
        else
            this.weight=weight;

    }

    public int getWeight(){
        return this.weight;
    }

    public String getName(){
        return this.name;
    }
}
