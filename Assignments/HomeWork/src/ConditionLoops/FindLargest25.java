package ConditionLoops;

import java.util.ArrayList;
import java.util.Scanner;
//  25: Take integer inputs till the user enters 0 and print the largest number from all.
public class FindLargest25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max_number = Integer.MIN_VALUE;
        int number;
        do {
            System.out.print("Enter the number or press 0 for exit");
            number = in.nextInt();
            if (number > max_number){
                max_number = number;
            }
        } while (number != 0);
        System.out.println("Largest number is: "+ max_number);
    }
}
