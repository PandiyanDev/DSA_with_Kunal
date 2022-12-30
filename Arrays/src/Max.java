public class Max {
    public static void main(String[] args) {
        int[] arr = {3,45,65,23,432,23};
        System.out.println("max: "+ max(arr));
        System.out.println("MaxRange: " + maxRange(arr, 1,3));
    }

    // find maximum number within the range of an array
    static int maxRange(int[] arr, int start, int end) {
        int maxVal = arr[start];
        for (int i = start; i < end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;

    }


    // find maximum number in the array
    static int max(int[] arr) {
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
