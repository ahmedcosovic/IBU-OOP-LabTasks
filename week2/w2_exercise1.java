import java.util.Scanner;

public class w2_exercise1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String pw2 = "password";
        String secret = "OOP";
        while (true)
        {
            System.out.println("Type a password: ");
            String pw = reader.nextLine();
            if(pw.equals(pw2))
            {
                System.out.println("You are right.");
                break;
            }
            else {
                System.err.println("Try again.");
            }
        }
        System.out.println("The secret is: "+secret);
    }
}
