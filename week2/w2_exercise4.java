import java.util.Scanner;

public class w2_exercise4 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int first=reader.nextInt();
        System.out.println("Enter last number: ");
        int last=reader.nextInt();
        while(first<=last)
        {
            System.out.println(first);
            first++;
        }
    }
}
