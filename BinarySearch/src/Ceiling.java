public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16,18};
        int target =15;
        int aus = ceiling(arr, target);
        System.out.println(aus);
    }

    // return the index of the smallest no >= target
    static int ceiling(int[] arr, int target) {

        // but what if the target is greater than the greatest number in the array
        // For example, here target = 20, but the array greatest number is 18. So we know target not in the array.
        if (target > arr[arr.length -1]) {
            return -1;
        }
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
        return start;
    }
}