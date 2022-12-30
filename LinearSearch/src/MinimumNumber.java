public class MinimumNumber {
    public static void main(String[] args) {
        int[] arr = {34,85,30,45,33,42,35,26,34,53,45};
//        System.out.println(minimum(arr));
        System.out.println(max(arr));
    }

    // find the minimum number in an array
    static int minimum(int[] arr){
        int min = arr[0];
        for (int j : arr) {
            if (min > j) {
                min = j;
            }
        }
        return min;
    }

    // find the maximum number in an array
    static int max(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if(max < i){
                max = i;
            }
        }
        return  max;
    }
}
