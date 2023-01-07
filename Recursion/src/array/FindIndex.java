package array;

import java.util.ArrayList;

public class FindIndex {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 18, 3, 9};
//        System.out.println(find(arr, 18, 0));
//        System.out.println(findIndex(arr, 1, 0));
//        System.out.println(findIndexLast(arr, 18, arr.length-1));
//        findAllIndex(arr, 3, 0);
//        System.out.println(list);

//        ArrayList<Integer> ans = findIndexes(arr, 3, 0, new ArrayList<>());
//        System.out.println(ans);

        System.out.println(findIndexes2(arr, 3, 0));

    }

    // to get target is present or not
    // To return true or false
    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr, target, index+1);
    }

    // This is return index of target
    static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length){
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return findIndex(arr, target, index + 1);
    }

    // This is search from last index to first index
    static int findIndexLast(int[] arr, int target, int index) {
        if (index == -1){
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return findIndexLast(arr, target, index - 1);
    }

    // This is target have duplicates. So get all index of target
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length){
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }

    static ArrayList<Integer> findIndexes(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length){
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findIndexes(arr, target, index + 1, list);
    }

    // if you don't pass any argument or parameter. Then find all index of target
    static ArrayList<Integer> findIndexes2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length){
            return list;
        }
        // this will contain answer for that function call only
        if (arr[index] == target) {
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = findIndexes2(arr, target, index + 1);

        // each function call have its own array list.
        // So add all the list and return to one list.
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
