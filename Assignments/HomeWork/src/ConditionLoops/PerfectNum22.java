package ConditionLoops;

import java.util.Scanner;

public class PerfectNum22 {
    // How to find a perfect number in java
    // a perfect is sum of factors(excluding the number itself)

    // Using method
    static long isPerfect(long num){
        long sum = 0;
        for (int i = 0; i < num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return  sum;
    }

    public static void main(String[] args) {
//        long n, sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your number: ");
        long n = in.nextLong();
        long number = isPerfect(n);
//        int i = 1;
//
//        // executes until the condition becomes false
//        while (i <= n/2){
//            if (n % i == 0){
//                sum = sum + i;
//            }
//            i++;
//        }
//
//        if (sum == n) {
//            System.out.println(n + " is a Perfect Number.");
//        } else {
//            System.out.println(n + " is not a Perfect Number");
//        }

        if (number == n){
            System.out.println(number + " is a perfect Number");
        } else {
            System.out.println(number + " is not a perfect Number");
        }

    }
}
