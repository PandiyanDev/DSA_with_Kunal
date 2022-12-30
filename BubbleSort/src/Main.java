import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 2, 5, 11, 0, -12, 30, -40};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubble(int[] arr) {
        boolean swapped = false;
        //run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            // for each step, max item will come at the respective index
            for (int j = 1; j < arr.length -i; j++) {
                if(arr[j]< arr[j-1]){
                    // swap the items
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

}