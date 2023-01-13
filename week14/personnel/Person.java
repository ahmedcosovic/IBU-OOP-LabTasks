package personnel;

public class Person {
    private String name;
    private Education title;

    public Person(String name, Education title){
        this.name=name;
        this.title=title;
    }

    public Education getEducation(){
        return this.title;
    }

    public String toString(){
        return this.name+", "+this.getEducation();
    }
}
