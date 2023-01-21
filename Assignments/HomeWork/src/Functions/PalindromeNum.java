package Functions;

import java.util.Scanner;

public class PalindromeNum {
    // find the number is palindrome or not.
    // example 89398 -> its reversed also 89398
    // this is palindrome number

    static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;
        while (num != 0){
            int lastDigit = num % 10;
            reversed = reversed * 10 + lastDigit;
            num /= 10;
        }
        return reversed == original;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = in.nextInt();
        boolean result = isPalindrome(num);
        if (result) {
            System.out.println(num + " is a palindrome number");
        } else {
            System.out.println(num + " is not a palindrome number");
        }
    }
}
