package Functions;

import java.util.Scanner;

public class Factorical_9 {
    // Here, I am use recursion method
    static int factorial(int num){
        if (num <= 1){
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = in.nextInt();
        int fact = factorial(num);
        System.out.println("Factorial of " + num + " is: " + fact);
    }
}
