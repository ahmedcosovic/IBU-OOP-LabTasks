import java.util.Random;
import java.util.Scanner;

public class w2_exercise8 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int pogodi = drawNumber();
        int pokusaji = 0;
        while(true) {
            System.out.print("Enter a number: ");
            int x = reader.nextInt();
            if(x==pogodi) {
                System.out.println("You guessed the correct number.");
                break;
            }
            if(x<pogodi) {
                pokusaji++;
                System.out.println("The number is greater, guesses made: "+pokusaji);
            }
            if(x>pogodi) {
                pokusaji++;
                System.out.println("The number is lesser, guesses made: "+pokusaji);
            }
        }
    }

    private static int drawNumber()
    {
        Random rand = new Random();
        int broj = rand.nextInt(101);
        return broj;
    }
}
