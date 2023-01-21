package Functions;

import java.util.Scanner;

//Write a program to print the sum of two numbers entered by user by defining your own method.
public class SumOfTwoNum_4 {
    // here I am using float because sometime add float so get perfect result
    // this floating point number is also handle integer, because float has own casting option.
    // but integer don't have own casting function
    static float addition(float num1, float num2){
        return num1 + num2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        float num1 = in.nextFloat();
        System.out.print("Enter you second number: ");
        float num2 = in.nextFloat();
        System.out.println("Sum of "+ num1+" and "+ num2+ " is: " + addition(num1, num2));
    }
}
