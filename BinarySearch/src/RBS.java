public class RBS {
    // RBS --> Rotated Binary Search
    // https://leetcode.com/problems/search-in-rotated-sorted-array/
    public static void main(String[] args) {
        int[] arr = {7,8,1,2,3,4,5,6};
        int target = 4;
        System.out.println(search(arr, target));

    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        // if you didn't find a pivot, it means the array is not rotated
        if (pivot == -1) {
            // just do binary search
            return binarySearch(nums, target, 0, nums.length -1);
        }

        // if you found pivot
        if (nums[pivot] == target) {
            return pivot;
        }
        if (target >=  nums[0]) {
            return binarySearch(nums, target, 0, pivot -1);
        }
        return binarySearch(nums, target, pivot + 1, nums.length -1);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

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

    // use when array without duplicates
    static int findPivot(int[] arr) {
        // initialize the start and end index
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            // 4 case here
            if(mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if(arr[mid] <= arr[start]) {
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return  -1;
    }

    // Use when given array with duplicates
    static int findPivotWithDuplicates(int[] arr) {
        // initialize the start and end index
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            // 4 case here
            if(mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            // if elements at start, middle and end all are equal then just ignored duplicate elements
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // ignore duplicates
                // NOTE: what if these elements at start and end were the pivot?
                // check if start is pivot
                if (arr[start] > arr[start +1]) {
                    return start;
                }
                start++;
                // Similarly end
                if (arr[end] < arr[end-1]) {
                    return end -1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return  -1;
    }
}
