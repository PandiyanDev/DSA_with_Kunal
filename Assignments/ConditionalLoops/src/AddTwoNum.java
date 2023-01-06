import java.util.Scanner;

public class AddTwoNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = in.nextInt();
        System.out.print("Enter a number: ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        int product = num1 * num2;
        System.out.println("Total value of "+ num1+ " and " + num2 + " is " + sum);
        System.out.println("Product of "+ num1+ " and " + num2 + " is " + product);
    }
}
