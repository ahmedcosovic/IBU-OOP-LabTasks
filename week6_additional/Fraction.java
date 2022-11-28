public class Fraction {
    private int numerator=0;
    private int denominator=1;

    public Fraction(){}

    public Fraction(int numerator, int denominator){
        this.numerator=numerator;
        this.denominator=denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public double result() {
        return (double)this.numerator/this.denominator;
    }

    public int najveciZajednicki(){
        int i, x=1;

        int manji=this.numerator;
        if (this.denominator<manji)
            manji=this.denominator;

        for(i=2;i<=manji;i++){
            if(this.numerator%i==0 && this.denominator%i==0)
                x=i;
        }

        return x;
    }

    public String LowestTerms(){
        int nzd = najveciZajednicki();
        int brojnik = this.numerator/nzd;
        int nazivnik = this.denominator/nzd;
        return brojnik+"/"+nazivnik;
    }

    public String toString(){
        return this.numerator+"/"+this.denominator;
    }
}
