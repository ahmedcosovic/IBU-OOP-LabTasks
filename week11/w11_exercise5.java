import java.io.File;
import java.io.FileNotFoundException;

public class w11_exercise5 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("week11/testfile.txt");
        Analysis analysis =  new Analysis(file);
        System.out.println("Lines: "+analysis.lines());
        System.out.println("Characters: "+analysis.characters());
    }
}
