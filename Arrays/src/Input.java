import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // array of primitive
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 24;
        arr[2] = 25;
        arr[3] = 26;
        arr[4] = 27;
        // [23,24,25,26,27]

//        for (int i = 0; i < arr.length; i++){
//            arr[i] = in.nextInt();
//            System.out.print(arr[i] + " ");
//        }

//        System.out.println(Arrays.toString(arr));

        // array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();

        }
        System.out.print(Arrays.toString(str));
    }
}
