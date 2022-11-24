public class w6_exercise2 {
    public static int indexOfTheSmallest(int[] array) {
        int i=1;
        int x=array[0];
        int index=0;
        while (i<array.length) {
            if(array[i]<x) {
                x = array[i];
                index = i;
            }
            i++;
        }
        return index;
    }

    public static void main(String[] args) {
        int[] values = {6,5,8,7,11};
        System.out.println("Index of the smallest: "+indexOfTheSmallest(values));
    }
}
