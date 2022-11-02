import java.util.ArrayList;
import java.util.Scanner;

public class w3_exercise8 {
    public static boolean palindrome(String rijec) {
        String obrnuto = "";
        int i=rijec.length()-1;
        while(i>=0) {
            obrnuto += rijec.charAt(i);
            i--;
        }
        return rijec.equals(obrnuto);
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a text: ");
        String tekst = reader.nextLine();
        if(palindrome(tekst))
            System.out.println("The text is a palindrome!");
        else
            System.out.println("The text is not a palindrome!");
    }
}
