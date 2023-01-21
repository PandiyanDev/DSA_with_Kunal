package Array;

import java.util.Arrays;
import java.util.Scanner;

// https://leetcode.com/problems/build-array-from-permutation/
public class StringPermutation {
    // permutation means generate all possible ways of string or number
    static int[] buildArray(int[] perm){
        int[] result = new int[perm.length];
        for (int i = 0; i < perm.length; i++) {
            result[i] = perm[perm[i]];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] perm = {0,2,1,5,3,4};
        int[] result = buildArray(perm);
        System.out.println("Resulting array: " + Arrays.toString(result));
    }
}
