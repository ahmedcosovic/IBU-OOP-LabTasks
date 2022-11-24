public class BinarySearch {
    public static boolean search(int[] array, int searchedValue) {
        int low=0;
        int high=array.length-1;
        int mid;

        while(low!=high) {
            mid=(low+high)/2;

            if(searchedValue==array[mid])
                return true;

            if(searchedValue>array[mid]){
                low=mid+1;
            }

            if(searchedValue<array[mid]) {
                high = mid - 1;
            }

            if(low==high && searchedValue==array[low])
                return true;
        }

        return false;
    }
}
