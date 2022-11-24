import java.util.ArrayList;

public class Library {

    private ArrayList<Book> list = new ArrayList<Book>();
    public Library(){}

    public void addBook(Book newBook){
        list.add(newBook);
    }

    public void printBooks(){
        int i;
        for(i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> found = new ArrayList<Book>();
        int i;
        for(i=0;i<list.size();i++){
            if(StringUtils.included(list.get(i).title(),title)){
                found.add(list.get(i));
            }
        }
        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> found = new ArrayList<Book>();
        int i;
        for(i=0;i<list.size();i++){
            if(StringUtils.included(list.get(i).publisher(),publisher)){
                found.add(list.get(i));
            }
        }
        return found;
    }

    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> found = new ArrayList<Book>();
        int i;
        for(i=0;i<list.size();i++){
            if(list.get(i).year()==year){
                found.add(list.get(i));
            }
        }
        return found;
    }
}
