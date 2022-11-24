public class w6_exercise1 {
    public static int smallest(int[] array) {
        int i=1;
        int x=array[0];
        while (i<array.length) {
            if(array[i]<x)
                x=array[i];
            i++;
        }
        return x;
    }

    public static void main(String[] args) {
        int[] values = {6,5,8,7,11};
        System.out.println("smallest: "+smallest(values));
    }
}
