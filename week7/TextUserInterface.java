import java.util.Scanner;

public class TextUserInterface {

    private Scanner reader = new Scanner(System.in);
    private Dictionary dictionary = new Dictionary();

    public TextUserInterface(Scanner reader, Dictionary dictionary){
        this.reader=reader;
        this.dictionary=dictionary;
    }

    public void start(){
        System.out.println("Statements: ");
        System.out.println("\tadd - adds a word pair to the dictionary\n\ttranslate - asks a word and prints its translation\n\tquit - quit the text user interface");
        System.out.println();
        while(true) {
            System.out.print("Statement: ");
            String command = reader.nextLine();
            if(command.equals("quit")) {
                System.out.println("Cheers!");
                break;
            }
            else if(command.equals("add")){
                System.out.print("In Finnish: ");
                String inFinnish = reader.nextLine();
                System.out.print("Translation: ");
                String trans = reader.nextLine();
                dictionary.add(inFinnish,trans);
                System.out.println();
            }
            else if(command.equals("translate")){
                System.out.print("Give a word: ");
                String aWord = reader.nextLine();
                System.out.println("Translation: "+dictionary.translate(aWord));
                System.out.println();
            }
            else
                System.out.println("Unknown statement");
        }

    }
}
