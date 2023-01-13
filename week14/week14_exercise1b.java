import java.util.Scanner;

public class week14_exercise1b {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Give a string: ");
        String dan = reader.nextLine();
        if(allVowels(dan)){
            System.out.println("The form is fine.");
        }
        else {
            System.out.println("The form is wrong.");
        }
    }
    public static boolean allVowels(String string){
        String x = "bcdfghjklmnpqrstvwxyz";
        for(char slovo: x.toCharArray()) {
            for(char slovo2: string.toCharArray()){
                if(slovo2==slovo)
                    return false;
            }
        }
        return true;
    }
}
