public class Bird {
    private String name;
    private String latin;

    private int observations=0;

    public Bird(String name, String latin){
        this.name=name;
        this.latin=latin;
    }
    public void addObservation(){
        this.observations++;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return this.name+" ("+this.latin+"): "+this.observations+" observations";
    }
}
