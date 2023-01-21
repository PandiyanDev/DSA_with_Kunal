package Functions;

import java.util.Scanner;

// Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
public class FindMinMax_1 {

    static int minimum(int num1,int num2, int num3){
        int temp = Math.min(num1, num2);
        return Math.min(temp, num3);
    }

    static int maximum(int num1,int num2, int num3){
        int temp = Math.max(num1, num2);
        return Math.max(temp, num3);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your first Number: ");
        int num1 = in.nextInt();

        System.out.print("Enter your second Number: ");
        int num2 = in.nextInt();

        System.out.print("Enter your third Number: ");
        int num3 = in.nextInt();

        int minimum = minimum(num1, num2, num3);
        int maximum = maximum(num1, num2, num3);

        System.out.printf("The smallest of three numbers %d, %d and %d is: %d %n", num1, num2, num3, minimum);
        System.out.printf("The largest of three numbers %d, %d and %d is: %d %n", num1, num2, num3, maximum);
    }
}
