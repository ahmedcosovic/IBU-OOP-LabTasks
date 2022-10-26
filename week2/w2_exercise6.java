import java.util.Scanner;

public class w2_exercise6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How many times: ");
        int n=reader.nextInt();
        int a=0;
        while (a<n) {
            printText();
            a++;
        }
    }

    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.\n");
    }
}
