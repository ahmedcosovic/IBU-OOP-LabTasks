import people.Person;
import people.Student;
import people.Teacher;

import java.util.ArrayList;
import java.util.List;

public class w12_exercise1e {
    public static void printDepartment(List<Person> people) {
        int i=0;
        while(i<people.size()){
            System.out.println(people.get(i));
            i++;
        }
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<Person>();
        people.add( new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200) );
        people.add( new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki") );

        printDepartment(people);
    }
}
