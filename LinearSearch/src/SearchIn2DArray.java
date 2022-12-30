
import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {32,34,45,56,70},
                {48,31,23},
                {34,23},
                {45,13,49,37,65},
                {34,42,56,78}
      };
        int target = 37;
        int[] aus = search(arr, target);
        System.out.println(Arrays.toString(aus));

        System.out.println(max(arr));
        System.out.println(min(arr));
    }

     // find the target position of an array
    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    // find maximum number in a 2D array
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }

    // find the minimum number in a 2D array
    static int min(int[][] arr){
        int min = arr[0][0];
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element < min) {
                    min = element;
                }
            }
        }
        return min;
    }
}
