public class w6_exercise3 {
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int i=index;
        int x=array[index];
        int index2=index;
        while (i<array.length) {
            if(array[i]<x) {
                x = array[i];
                index2 = i;
            }
            i++;
        }
        return index2;
    }

    public static void main(String[] args) {
        int[] values = {-1,6,9,8,12};
        System.out.println(indexOfTheSmallestStartingFrom(values,1));
        System.out.println(indexOfTheSmallestStartingFrom(values,2));
        System.out.println(indexOfTheSmallestStartingFrom(values,4));
    }
}
