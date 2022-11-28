public class TemperatureMain {
    public static void main(String[] args) {
        Temperature skala = new Temperature(0);
        System.out.println(skala);
        System.out.println();

        skala.setTempCelsius(0);
        System.out.println(skala);
        System.out.println();

        skala.setTempFahrenheit(0);
        System.out.println(skala);
        System.out.println();

        skala.setTempKelvin(0);
        System.out.println(skala);
    }
}
