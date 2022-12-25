public class w10_exercise2a {
    public static void main(String[] args) {
        Book2 book1 = new Book2("Fedor Dostojevski","Crime and Punishment", 2);
        Book2 book2 = new Book2("Robert Martin","Clean Code", 1);
        Book2 book3 = new Book2("Kent Beck","Test Driven Development", 0.5);

        CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon",1973);
        CD cd2 = new CD("Wigwam", "Nuclear Nightclub",1975);
        CD cd3 = new CD("Rendezvous Park", "Closer to Being Here",2012);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(cd1);
        System.out.println(cd2);
        System.out.println(cd3);
    }
}
