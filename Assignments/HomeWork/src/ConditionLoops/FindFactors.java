package ConditionLoops;

import java.util.Scanner;
// 23. Input a number and print all the factors of that number (use loops).

public class FindFactors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to find the factors of: ");
        int number = in.nextInt();

        System.out.println("The factors of " + number + " are:");
        for (int i = 1; i < number + 1; i++) {
            if(number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
