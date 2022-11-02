import java.util.ArrayList;

public class w3_exercise7 {
    public static ArrayList<Integer> lengths (ArrayList<String> list) {
        int i=0;
        ArrayList<Integer> listbr=new ArrayList<Integer>();
        while(i<list.size()){
            listbr.add((list.get(i)).length());
            i++;
        }
        return listbr;
    }
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hallo");
        list.add("Moi");
        list.add("Benvenuto!");
        list.add("badger badger badger badger");
        ArrayList<Integer> lengths = lengths(list);
        System.out.println("The lengths of the Strings: "+ lengths);
    }
}
