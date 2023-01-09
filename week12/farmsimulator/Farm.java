package farmsimulator;

import java.util.ArrayList;

public class Farm implements Alive{
    private String name;
    private Barn barn;

    private ArrayList<Cow> cows = new ArrayList<Cow>();

    public Farm(String name, Barn barn){
        this.name=name;
        this.barn=barn;
    }
    @Override
    public void liveHour() {
        int i=0;
        while(i<this.cows.size()){
            this.cows.get(i).liveHour();
            i++;
        }
    }

    public String toString(){
        int i=0;
        String str = "Farm owner: "+this.getOwner()+"\nBarn bulk tank: "+this.barn.getBulkTank();
        if(cows.size()==0)
            str+="\nNo cows.";
        else {
            str+="\nAnimals:";
            while(i<cows.size()){
                str+="\n\t"+cows.get(i);
                i++;
            }
        }
        return str;
    }

    public void addCow(Cow cow){
        cows.add(cow);
    }

    public String getOwner(){
        return this.name;
    }


}
