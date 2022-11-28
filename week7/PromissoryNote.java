import java.util.HashMap;

public class PromissoryNote {
    HashMap<String,Double> hm = new HashMap<String,Double>();
    public PromissoryNote(){}
    public void setLoan(String toWhom, double value){
        this.hm.put(toWhom,value);
    }
    public double howMuchIsTheDebt(String whose){
        if(hm.containsKey(whose))
            return this.hm.get(whose);
        else{
            hm.put(whose,(double)0);
            return this.hm.get(whose);
        }
    }
}
