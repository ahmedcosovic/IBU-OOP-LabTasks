public class week13_exercise5 {
    public static void main(String[] args) {
        Calculator calc = new PersonalCalculator();
        System.out.println("Value: " + calc.giveValue());
        calc.increase();
        System.out.println("Value: " + calc.giveValue());
        calc.increase();
        System.out.println("Value: " + calc.giveValue());

        Calculator calculator = new PersonalCalculator();
        UserInterface userInterface = new UserInterface(calculator);
        userInterface.setVisible(true);
    }
}
