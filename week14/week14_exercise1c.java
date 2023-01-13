import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class week14_exercise1c {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Give a string: ");
        String dan = reader.nextLine();
        if(clockTime(dan)){
            System.out.println("The form is fine.");
        }
        else {
            System.out.println("The form is wrong.");
        }
    }
    public static boolean clockTime(String string){
        String[] sat = string.split(":");
        int hh = Integer.parseInt(sat[0]);
        int mm = Integer.parseInt(sat[1]);
        int ss = Integer.parseInt(sat[2]);
        if(hh>=0 && hh<24){
            if(mm>=0 && mm<60){
                if(ss>=0 && ss<60){
                    return true;
                }
                else return false;
            }
            else return false;
        }
        else return false;
    }
}
