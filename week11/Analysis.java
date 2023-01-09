import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Analysis {
    private File file;
    private Scanner reader;

    public Analysis(File file) throws FileNotFoundException {
        this.file = file;
    }

    public int lines() throws FileNotFoundException {
        this.reader = new Scanner(this.file);
        int c=0;
        while(reader.hasNextLine()){
            c++;
            reader.nextLine();
        }
        reader.close();
        return c;
    }

    public int characters() throws FileNotFoundException {
        this.reader = new Scanner(this.file);
        int c=0;
        while(reader.hasNext()){
            String red = reader.nextLine();
            c+=red.length()+1;
        }
        reader.close();
        return c;
    }
}
