import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class w3_exercise6 {
    public static void main(String[] args) {
        ArrayList<String> rijeci = new ArrayList<String>();
        Scanner reader = new Scanner(System.in);
        String word = new String();
        while(true){
            System.out.print("Type a word: ");
            word = reader.nextLine();
            if (rijeci.contains(word)){
                break;
            }
            rijeci.add(word);
        }
        Collections.sort(rijeci);
        System.out.println("You gave the word "+word+" twice");
        System.out.println("Array: "+rijeci);
    }
}
