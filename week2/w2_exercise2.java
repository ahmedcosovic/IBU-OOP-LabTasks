import java.util.Scanner;

public class w2_exercise2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int s=0, i;
        for(i=0;i<3;i++)
        {
            System.out.println("Enter number "+(i+1)+": ");
            s+=reader.nextInt();
        }
        System.out.println("Sum: "+s);
    }
}
