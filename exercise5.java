import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("Type a number: ");
        int broj=Integer.parseInt(reader.nextLine());
        if(broj>0)
        {
            System.out.println("The number is positive.");
        }
        else
        {
            System.out.println("The number is not positive.");
        }
    }
}
