import java.util.Scanner;

public class week14_exercise1a {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Give a string: ");
        String dan = reader.nextLine();
        if(isAWeekDay(dan)){
            System.out.println("The form is fine.");
        }
        else {
            System.out.println("The form is wrong.");
        }
    }

    public static boolean isAWeekDay(String string){
        if(string.equals("mon") || string.equals("tue") || string.equals("wed") || string.equals("thu") || string.equals("fri") || string.equals("sat") || string.equals("sun"))
            return true;
        return false;
    }
}
