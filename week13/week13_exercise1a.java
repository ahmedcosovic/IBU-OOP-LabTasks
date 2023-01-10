import java.io.FileNotFoundException;
import java.io.IOException;

public class week13_exercise1a {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileManager f = new FileManager();
        for (String line : f.read("week13/exercisefile.txt")) {
            System.out.println(line);
        }
    }
}
