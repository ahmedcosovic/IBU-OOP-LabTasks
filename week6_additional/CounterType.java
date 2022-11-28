public class CounterType {
    private int c=0;

    public CounterType(){}
    public CounterType(int n){
        if(n>=0)
            this.c=n;
    }

    public void setCounter(int n){
        if(n>=0)
            this.c=n;
    }

    public void increase(){
        this.c++;
    }

    public void decrease(){
        if(this.c>0) {
            this.c--;
        }
    }

    public int current() {
        return this.c;
    }

    public String toString(){
        return "Current count: "+this.c;
    }
}
