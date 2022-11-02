import java.util.Scanner;

public class w3_exercise4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        System.out.print("In reverse order: ");
        int i=0;
        while(i<name.length()) {
            System.out.print(name.charAt(name.length()-i-1));
            i++;
        }
    }
}
