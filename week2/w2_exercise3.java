import java.util.Scanner;

public class w2_exercise3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int s=0;
        while(true)
        {
            System.out.println("Enter number: ");
            int broj= reader.nextInt();
            if (broj==0)
                break;
            s+=broj;
            System.out.println("Sum now: "+s);
        }
        System.out.println("Sum in the end: "+s);
    }

}
