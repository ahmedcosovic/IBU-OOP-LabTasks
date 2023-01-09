package people;

public class Student extends Person {
    private int credits=0;
    public Student(String name, String address){
        super(name, address);
    }

    public int credits(){
        return this.credits;
    }

    public void study(){
        this.credits++;
    }

    @Override
    public String toString(){
        return this.getName()+"\n  "+this.getAddress()+"\n  credits "+this.credits;
    }
}
