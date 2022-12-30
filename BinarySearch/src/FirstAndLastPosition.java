import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
       // leetcode --> https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

        int[] nums = {5,7,7,8,8,10};
        int  target = 8;
        int[] result = searchRange(nums, target);
        System.out.println(Arrays.toString(result));
    }
    static int[] searchRange(int[] nums, int target) {

        // initialize the end value
        int[] aus = {-1, -1};
        int start = search(nums, target, true);
        int end = search(nums, target, false);

        aus[0] = start;
        aus[1] = end;

        return aus;
    }

    static int search(int[] nums, int target, boolean findStartIndex) {
        int aus = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <=end ){
            //find middle index
            int mid = start + (end - start) / 2;

            if (target < nums[mid]){
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                aus = mid;
                if (findStartIndex) {
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return aus;
    }

}
