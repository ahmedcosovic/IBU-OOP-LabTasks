public class Temperature {
    private double kelvin;
    private double celsius;
    private double fh;

    public Temperature() {}

    public Temperature(double kelvin){
        this.setTempKelvin(kelvin);
    }

    public void setTempKelvin(double value) {
        this.kelvin=value;
        this.celsius=value-273.15;
        this.fh=(9*this.celsius+160)/5.;
    }

    public void setTempCelsius(double value) {
        this.celsius=value;
        this.kelvin=value+273.15;
        this.fh=(9*this.celsius+160)/5.;
    }

    public void setTempFahrenheit(double value) {
        this.fh=value;
        this.celsius=(5.0/9)*(this.fh-32);
        this.kelvin=this.celsius+273.15;
    }

    public double kelvin(){
        return this.kelvin;
    }

    public double celsius(){
        return this.celsius;
    }

    public double fahrenheit(){
        return this.fh;
    }

    public String toString(){
        return "Kelvin: "+this.kelvin+"\nCelsius: "+this.celsius+"\nFahrenheit: "+this.fh;
    }
}
