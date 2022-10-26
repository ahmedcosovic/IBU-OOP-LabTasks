public class w2_exercise7 {
    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
    }
    private static void printStars(int n)
    {
        int a=0;
        while(a<n) {
            System.out.print('*');
            a++;
        }
        System.out.print('\n');
    }
}
