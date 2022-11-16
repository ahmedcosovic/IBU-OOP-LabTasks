import java.util.ArrayList;

public class Team {
    private String name;
    private int max=16;
    private ArrayList<Player> igraci = new ArrayList<Player>();

    public Team(String name) {
        this.name=name;
    }

    public String getName() {
        return this.name;
    }

    public void addPlayer(Player igrac) {
        if(this.igraci.size()<16)
            this.igraci.add(igrac);
    }

    public void printPlayers() {
        int i=0;
        while(i<this.igraci.size()) {
            System.out.println(this.igraci.get(i));
            i++;
        }
    }

    public void setMaxSize(int maxSize) {
        this.max=maxSize;
    }

    public int size(){
        return this.max;
    }

    public int goals() {
        int i=0;
        int gls=0;
        while(i<this.igraci.size()){
            gls+=this.igraci.get(i).getGoals();
            i++;
        }
        return gls;
    }
}
