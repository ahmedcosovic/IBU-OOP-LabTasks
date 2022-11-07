import java.util.Random;

public class w4_exercise2 {
    public static void main(String[] args) {
        Dice dice = new Dice(6);
        int i=0;
        while(i<10) {
            System.out.println(dice.roll());
            i++;
        }
    }
}
