package personnel;

import java.util.ArrayList;
import java.util.List;

public class Employees {
    private List<Person> uposlenici = new ArrayList<Person>();

    public void add(Person person){
        this.uposlenici.add(person);
    }

    public void add(List<Person> persons){
        this.uposlenici.addAll(persons);
    }

    public void print(){
        for(int i=0; i<this.uposlenici.size(); i++){
            System.out.println(this.uposlenici.get(i));
        }
    }

    public void print(Education education){
        for(int i=0; i<this.uposlenici.size(); i++){
            if(this.uposlenici.get(i).getEducation()==education){
                System.out.println(this.uposlenici.get(i));
            }
        }
    }

    public void fire(Education education){
        for(int i=0; i<this.uposlenici.size(); i++){
            if(this.uposlenici.get(i).getEducation()==education){
                this.uposlenici.remove(this.uposlenici.get(i));
            }
        }
    }


}
