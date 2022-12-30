import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /*
                1 2 3
                4 5 6
                7 8 9
         */

//        int[][] arr = new int[3][3];

//        int[][] arr = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//        System.out.println(arr[1][0]);
//        System.out.println(Arrays.toString(arr[1]));

        int[][] arr = new int[3][3];
        Scanner in = new Scanner(System.in);
        // input
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        // output
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
            // simplify
//            System.out.println(Arrays.toString(arr[row])); // return all rows
//        }

        // to simplify above for loop

        /*   Syntax enhance for loop
                for(datatype ref_variable: key_variable) {
                    //body
                 }
         */

        for(int[] a: arr) {
            System.out.println(Arrays.toString(a));
        }
    }

}
