import java.util.Scanner;

public class BirdMain {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String command = "";
        BirdWatcher db = new BirdWatcher();

        while(true) {
            System.out.print("? ");
            command = reader.nextLine();
            if(command.equals("Add")){
                System.out.print("Name: ");
                String name = reader.nextLine();
                System.out.print("Latin Name: ");
                String latin = reader.nextLine();
                Bird temp = new Bird(name,latin);
                if(db.exists(name)==false){
                    db.addBird(temp);
                    System.out.println(name+" successfully added!");
                }
                else {
                    System.out.println("Bird already exists!");
                }
            }
            else if (command.equals("Observation")){
                System.out.print("What was observed:? ");
                String name = reader.nextLine();
                if(db.exists(name)){
                    db.addObsToBird(name);
                    System.out.println("Observation added!");
                }
                else {
                    System.out.println("Bird doesn't exist!");
                }
            }
            else if (command.equals("Statistics")){
                db.stats();
            }
            else if (command.equals("Show")){
                System.out.print("What? ");
                String name = reader.nextLine();
                if(db.exists(name)){
                    db.stats(name);
                }
                else
                    System.out.println("Bird doesn't exist!");
            }
            else if (command.equals("Quit")){
                break;
            }
            else {
                System.out.println("Unknown command, try again.");
            }
        }
    }
}
