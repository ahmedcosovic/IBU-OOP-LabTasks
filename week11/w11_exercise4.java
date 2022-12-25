public class w11_exercise4 {
    public static void main(String[] args) throws Exception {
        Printer printer = new Printer("week11/textFile.txt");
        printer.printLinesWhichContain("Väinämöinen");
        System.out.println("-----");
        printer.printLinesWhichContain("Frank Zappa");
        System.out.println("-----");
        printer.printLinesWhichContain("");
        System.out.println("-----");
    }
}
