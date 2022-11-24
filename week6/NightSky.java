import java.util.Random;

public class NightSky {
    private double density;
    private int w;
    private int h;

    private int lastStars=0;

    private Random rand = new Random();

    public NightSky(double density){
        this.density=density;
        this.w=20;
        this.h=10;
    }

    public NightSky(int w, int h){
        this.w=w;
        this.h=h;
        this.density=0.1;
    }

    public NightSky(double density, int w, int h){
        this.w=w;
        this.h=h;
        this.density=density;
    }

    public void printLine(){
        int i;
        for(i=0;i<this.w;i++){
            double x = rand.nextDouble();
            if(this.density>x){
                System.out.print("*");
                this.lastStars++;
            }
            else
                System.out.print(" ");
        }
        System.out.println();
    }

    public void print(){
        this.lastStars=0;
        int i;
        for(i=0;i<this.h;i++){
            this.printLine();
        }
    }

    public int starsInLastPrint(){
        return this.lastStars;
    }
}
