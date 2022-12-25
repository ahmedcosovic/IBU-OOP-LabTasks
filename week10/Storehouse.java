import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Storehouse {

    private Map<String, Integer> cijene;
    private Map<String, Integer> stanje;

    public Storehouse(){
        this.cijene = new HashMap<String, Integer>();
        this.stanje = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock){
        this.cijene.put(product,price);
        this.stanje.put(product,stock);
    }
    public int price(String product){
        if(this.stanje.containsKey(product)){
            return this.cijene.get(product);
        }
        else{
            return -99;
        }
    }

    public int stock(String product){
        if(this.stanje.containsKey(product)){
            return this.stanje.get(product);
        }
        else
            return 0;
    }

    public boolean take(String product){
        if(this.stanje.containsKey(product)){
            if(this.stanje.get(product)>0)
                this.stanje.put(product,this.stanje.get(product)-1);
            return true;
        }
        else
            return false;
    }

    public Set<String> products(){
        return this.stanje.keySet();
    }

}
