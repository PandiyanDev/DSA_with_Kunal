public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {2,34,5,6,46,34,4,53,34,34,45};
        int target = 4;
        int start = 2;
        int end = 8;
        boolean aus = search(arr, target, start,end);
        System.out.println(aus);
    }

    // find a number in an array with in the range
    static boolean search(int[] arr, int target, int start, int end){
        if (arr.length == 0) {
            return false;
        }
        for (int i = start; i < end; i++) {
            if (target == arr[i]) {
                return true;
            }
        }
        return false;
    }

}
