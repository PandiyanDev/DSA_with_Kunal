package Functions;

import java.util.Scanner;

// Define a program to find out whether a given number is even or odd.

public class OddOrEven_2 {

    // using bitwise operator

    static boolean isOdd(int num ){
        return (num & 1) == 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = in.nextInt();
        boolean result = isOdd(num);
        if (result) {
            System.out.println( num + " is an odd number");
        } else {
            System.out.println( num + " is an even number");
        }
    }
}
