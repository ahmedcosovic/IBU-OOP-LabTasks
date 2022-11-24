public class Book {
    private String title;
    private String publisher;
    private int pyear;

    public Book(String title, String publisher, int pyear) {
        this.title=title;
        this.publisher=publisher;
        this.pyear=pyear;
    }

    public String title(){
        return this.title;
    }

    public String publisher(){
        return this.publisher;
    }

    public int year(){
        return this.pyear;
    }

    public String toString(){
        return this.title+", "+this.publisher+", "+this.pyear;
    }
}
