public class Main {
    public static void main(String[] args) {
        int[] arr = {-3,4,6,9,12,14,17,18,20,22,25,27,29,30,34};
        int target =29;
        int aus = binarySearch(arr, target);
        System.out.println(aus);
    }

    // return the index
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while(start <= end) {
            // find the middle
//            int mid = (start + end) / 2  // this is may exceed the index range
            int mid = start + (end-start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}