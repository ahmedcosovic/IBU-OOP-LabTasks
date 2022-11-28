public class CounterTypeMain {
    public static void main(String[] args) {
        CounterType brojac1 = new CounterType();
        CounterType brojac2 = new CounterType(6);

        System.out.println("Initial values: ");
        System.out.println("Brojac 1 current: "+brojac1.current());
        System.out.println(brojac2);
        System.out.println();

        System.out.println("Increase 1, decrease 2:");
        brojac1.increase();
        brojac2.decrease();
        System.out.println(brojac1);
        System.out.println(brojac2);
        System.out.println();

        System.out.println("Set 1 to -5 (won't work) and 2 to 0 and decrease:");
        brojac1.setCounter(-5);
        brojac2.setCounter(0);
        brojac2.decrease();
        System.out.println(brojac1);
        System.out.println(brojac2);
        System.out.println();
    }
}
