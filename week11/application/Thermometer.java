package application;

import java.util.Random;

public class Thermometer implements Sensor {

    private boolean state=false;
    @Override
    public boolean isOn() {
        return this.state;
    }

    @Override
    public void on() {
        this.state=true;
    }

    @Override
    public void off() {
        this.state=false;
    }

    @Override
    public int measure() {
        if (this.state==true){
            Random rand = new Random();
            return rand.nextInt(30+30)-30;
        }
        else {
            throw new IllegalStateException("Thermometer is off!");
        }
    }
}
