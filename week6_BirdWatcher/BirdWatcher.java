import java.util.ArrayList;

public class BirdWatcher {
    private ArrayList<Bird> birds =new ArrayList<Bird>();

    public boolean exists(String name){
        int i;
        for(i=0;i<birds.size();i++){
            if(birds.get(i).getName().equalsIgnoreCase(name))
                return true;
        }
        return false;
    }

    public int birdIndex(String name){
        int i;
        for(i=0;i<birds.size();i++){
            if(birds.get(i).getName().equalsIgnoreCase(name))
                return i;
        }
        return -1;
    }

    public void addObsToBird(String name){
        if(this.birdIndex(name)!=-1){
            birds.get(birdIndex(name)).addObservation();
        }
    }
    public void addBird(Bird newbird){
        birds.add(newbird);
    }

    public void stats(){
        int i;
        for(i=0;i<birds.size();i++){
            System.out.println(birds.get(i));
        }
    }
    public void stats(String name){
        int i;
        for(i=0;i<birds.size();i++){
            if(name.equals(birds.get(i).getName())){
                System.out.println(birds.get(i));
            }
        }
    }
}
