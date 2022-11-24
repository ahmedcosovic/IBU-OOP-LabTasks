import java.util.Arrays;
import java.util.Scanner;

public class w6_exercise5 {
    public static void main(String[] args) {
        int[] array = {-3,2,3,4,7,8,12};
        Scanner reader = new Scanner(System.in);

        System.out.print("Values of the array: "+ Arrays.toString(array));
        System.out.println();

        System.out.print("Enter searched number: ");
        String searchedValue = reader.nextLine();

        boolean result = BinarySearch.search(array,Integer.parseInt(searchedValue));
        if (result==true) {
            System.out.println("Value "+searchedValue+" is in the array");
        }

        else {
            System.out.println("Value "+searchedValue+" is not in the array");
        }
    }
}
