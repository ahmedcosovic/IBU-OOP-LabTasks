package boxes;

import java.util.ArrayList;

public class MaxWeightBox extends Box{
    int mw;
    int current=0;

    ArrayList<Thing> things = new ArrayList<Thing>();

    public MaxWeightBox(int mw){
        this.mw=mw;
    }
    @Override
    public void add(Thing thing) {
        if(thing.getWeight()+this.current<=mw){
            things.add(thing);
            this.current+=thing.getWeight();
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        int i=0;
        while(i<things.size()){
            if(things.get(i).getName().equals(thing.getName())){
                return true;
            }
            i++;
        }
        return false;
    }
}
