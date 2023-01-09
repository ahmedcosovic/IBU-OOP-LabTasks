package boxes;

import java.util.ArrayList;

public class BlackHoleBox extends Box{

    private ArrayList<Thing> mysteries = new ArrayList<Thing>();

    @Override
    public void add(Thing thing) {
        mysteries.add(thing);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }
}
