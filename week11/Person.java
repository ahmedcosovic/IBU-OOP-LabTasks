public class Person {
    private int age;
    private String name;

    public Person(String name, int age) {
        this.name=name;
        this.age=age;

        if(name==null || name=="" || name.length()>40 || age<0 || age>120) {
            throw new IllegalArgumentException();
        }
    }


}
