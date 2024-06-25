public class RecursiveBinarySearch {
    public static int binarySearch(int[] array, int left, int right, int value) {
        if (left < right) {
        }
        int mid = left + (right - left) / 2;
        if (value > array[mid]) {
            return binarySearch( array,  mid+1, right,value);
        } else if (value == array[mid]) {
            return mid;
        } else {
            return binarySearch( array, left,  mid-1,  value);
        }

    }
}
