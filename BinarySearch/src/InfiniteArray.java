public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr= {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        System.out.println(aus(arr, target));

    }
    // Q: find the index of infinite numbers in that array.
    //https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

    // We don't know size of array. So we can't use length method.
    // Then how to find start and end of the array.
    // Here we assume start is 0 and end 1. If the target is not found in the array we double the end and start is end + 1.

    static int aus(int[] arr, int target) {
        // initialize start and end
        int start = 0;
        int end = 1;

        while(target > arr[end]) {
            int newStart = end + 1;
            // end is previous end + sizeofbox * 2
            end = end + (end - start +1) * 2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        //while condition for ascending order
        while(start<= end) {
            int mid = start + (end - start) / 2;
            if(target < arr[mid]) {
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
