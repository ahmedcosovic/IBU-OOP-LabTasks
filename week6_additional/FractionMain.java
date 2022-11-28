public class FractionMain {
    public static void main(String[] args) {
        Fraction razlomak = new Fraction();
        razlomak.setNumerator(20);
        razlomak.setDenominator(60);
        System.out.println(razlomak.LowestTerms());

        Fraction razlomak2 = new Fraction(14,28);
        System.out.println(razlomak2);
        System.out.println(razlomak2.LowestTerms());
    }
}
