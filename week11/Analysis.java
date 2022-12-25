import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Analysis {
    private File file;
    private Scanner reader = new Scanner(this.file);

    public Analysis(File file) throws FileNotFoundException {
        this.file=file;
    }
    public int lines(){
        int c=0;
        while(reader.hasNextLine()){
            c++;
        }
        return c;
    }
}
