package boxes;

import java.util.ArrayList;

public class OneThingBox extends Box {

    ArrayList<Thing> OneThing = new ArrayList<Thing>();

    public OneThingBox() {
    }


    @Override
    public void add(Thing thing) {
        if(OneThing.size()<1){
            OneThing.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if(OneThing.size()==1 && thing.getName().equals(this.OneThing.get(0).getName()))
            return true;
        return false;
    }
}