public class w3_exercise1 {
    public static double average(int a, int b, int c, int d)
    {
        double avg;
        int sum=a+b+c+d;
        avg=sum/4.;
        return avg;
    }
    public static void main(String[] args) {
        double answer = average(4,3,6,1);
        System.out.println("average: "+answer);
    }
}
