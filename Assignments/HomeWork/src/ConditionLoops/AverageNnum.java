package ConditionLoops;

import java.util.Scanner;

public class AverageNnum {
    // 3. Calculate Average Of N Numbers

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of integers going to be entered: ");
        int n = in.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter an integer: ");
            int num = in.nextInt();
            sum += num;
        }
        double average = (double) sum / n;
        System.out.println("Average: "+ average);

    }
}
