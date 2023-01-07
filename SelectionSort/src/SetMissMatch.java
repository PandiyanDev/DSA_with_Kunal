import java.util.Arrays;

public class SetMissMatch {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        int[] result = findErrorNums(nums);
        System.out.println(Arrays.toString(result));

    }
    static int[] findErrorNums(int[] arr) {
        int i = 0;
        while (i < arr.length){
            int correct_index = arr[i] - 1;
            if(arr[i] != arr[correct_index]) {
                swap(arr, i ,correct_index);
            }else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index+1) {
                return new int[] {index+1, arr[index]};
            }
        }
        return new int[] {-1,-1};
    }

    static  void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
