public class w10_exercise2b {
    public static void main(String[] args) {
        Box box = new Box(10);
        box.add(new Book2("Fedor Dostojevski", "Crime and Punishment", 2));
        box.add(new Book2("Robert Martin","Clean Code", 1));
        box.add(new Book2("Kent Beck","Test Driven Development", 0.7));

        box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

        System.out.println(box);
    }
}
