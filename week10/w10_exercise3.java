public class w10_exercise3 {
    public static void main(String[] args) {
        GenericClass<Integer> v1 = new GenericClass<Integer>(10);
        GenericClass<String> v2 = new GenericClass<String>("Hello World");

        System.out.println(v1);
        System.out.println(v2);
    }
}
