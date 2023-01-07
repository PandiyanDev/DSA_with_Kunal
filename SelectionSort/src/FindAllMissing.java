import java.util.*;

class FindAllMissing {

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,3,2,1};
        List<Integer> result = findDisapperedNumber(arr);
        System.out.println((result));
    }
    // leetcode problem: 448, find all missing number in an array
    static List<Integer> findDisapperedNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        //just find missing numbers
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index + 1) {
                ans.add(index + 1);
            }
        }
        return ans;
    }



    static  void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
