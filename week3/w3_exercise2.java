import java.util.Scanner;

public class w3_exercise2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        System.out.println("Number of characters: "+name.length());
    }
}
