public class Main {
    public static void main(String[] args) {
        int[] nums = {1,23,53,44,67,23,34,56,34,23,44,65,76};
        int target = 34;
        int aus = linearSearch(nums, target);
        System.out.println(aus);
    }

    // search in the array: return the index if item found
    // otherwise if item not found:  return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int index = 0; index < arr.length; index++) {
            int item = arr[index];
            if (item == target) {
                return index;
            }
        }

        // if target value doesn't in the array
        return -1;
    }
}