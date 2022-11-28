import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    HashMap<String,String> words = new HashMap<String,String>();

    public Dictionary(){}

    public String translate(String word){
        if(words.containsKey(word))
            return words.get(word);
        else
            return null;
    }

    public void add(String word, String translation){
        words.put(word,translation);
    }

    public int amountOfWords(){
        return words.size();
    }

    public ArrayList<String> translationList(){
        ArrayList<String> x = new ArrayList<String>();
        for(String key : words.keySet()){
            x.add(key+" = "+words.get(key));
        }
        return x;
    }
}
