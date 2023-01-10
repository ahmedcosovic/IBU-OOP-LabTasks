import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager {
    private ArrayList<String> lines = new ArrayList<String>();
    public ArrayList<String> read(String file) throws FileNotFoundException {
        File f = new File(file);
        Scanner reader = new Scanner(f);

        while(reader.hasNextLine()){
            String line = reader.nextLine();
            this.lines.add(line);
        }

        reader.close();

        return this.lines;
    }

    public void save(String file, String text) throws IOException {
        File f = new File(file);
        FileWriter fw = new FileWriter(file);
        fw.write(text);
        fw.close();
        read(file);
    }
}
