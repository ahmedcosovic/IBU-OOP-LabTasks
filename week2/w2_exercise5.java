import java.util.Scanner;

public class w2_exercise5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int n=reader.nextInt();
        int s=0, i;
        for(i=0;i<=n;i++)
        {
            s+=(int)Math.pow(2,i);
        }
        System.out.println("The result is "+s);
        reader.close();
    }
}
