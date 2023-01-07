public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        int result = findDuplicates(arr);
        System.out.println(result);

    }
    static int findDuplicates(int[] arr) {
        int i= 0;
        while (i < arr.length) {
            if(arr[i] != i+1) {
                int  correct_index = arr[i] - 1;
                if(arr[i] != arr[correct_index]) {
                    swap(arr, i, correct_index);
                } else {
                    return arr[i];
                }
            }else {
                i++;
            }
        }
        return -1;
    }

    static  void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
