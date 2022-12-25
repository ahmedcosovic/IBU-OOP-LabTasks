import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingBasket {
    Map<String, Purchase> basket;

    public ShoppingBasket(){
        basket = new HashMap<String, Purchase>();
    }

    public void add(String product, int price){
        if(basket.containsKey(product)){
            basket.get(product).increaseAmount();
        }else {
            Purchase purchase = new Purchase(product, 1, price);
            basket.put(product, purchase);
        }
    }

    public int price(){
        int totalPrice = 0;

        for(Purchase p : basket.values()){
            totalPrice = totalPrice + p.price();
        }

        return totalPrice;
    }

    public void print(){
        for(Purchase p : basket.values()){
            System.out.println(p);
        }
    }
}
