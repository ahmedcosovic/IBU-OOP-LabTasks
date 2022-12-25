package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private List<Integer> vrijednosti = new ArrayList<Integer>();
    private ArrayList<Sensor> senzori = new ArrayList<Sensor>();

    public void addSensor(Sensor additional){
        this.senzori.add(additional);
    }
    @Override
    public boolean isOn() {
        int i=0;
        while(i<this.senzori.size()){
            if(this.senzori.get(i).isOn()==false){
                return false;
            }
            i++;
        }
        return true;
    }

    @Override
    public void on() {
        int i=0;
        while(i<this.senzori.size()){
            this.senzori.get(i).on();
            i++;
        }
    }

    @Override
    public void off() {
        int i=0;
        while(i<this.senzori.size()){
            this.senzori.get(i).off();
            i++;
        }
    }

    @Override
    public int measure() {
        if(this.isOn()==false || this.senzori.size()==0)
            throw new IllegalStateException("Invalid.");
        int sum=0;
        int n=0;
        while(n<this.senzori.size()){
            sum+=this.senzori.get(n).measure();
            n++;
        }
        int avg=sum/n;
        this.vrijednosti.add(avg);
        return avg;
    }

    public List<Integer> readings() {
        return this.vrijednosti;
    }
}
