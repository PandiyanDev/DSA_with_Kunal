package Functions;

import java.util.Scanner;

// Define a method that returns the product of two numbers entered by user.
public class ProductOfTwoNum_5 {

    static int product(int num1, int num2){
        return num1 * num2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter you second number: ");
        int num2 = in.nextInt();
        System.out.println("Sum of "+ num1+" and "+ num2+ " is: " + product(num1, num2));
    }
}
