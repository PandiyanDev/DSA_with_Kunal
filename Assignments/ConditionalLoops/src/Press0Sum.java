import java.util.Scanner;
// 24. Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
public class Press0Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int num;

        // do while
//        do {
//            System.out.println("Enter a number or press 0 to quit: ");
//            num = in.nextInt();
//            sum += num;
//        } while (num != 0);

        // while
        System.out.print("Enter a number or press 0 to quit: ");
        num = in.nextInt();
        while (num != 0) {
            sum += num;
            System.out.print("Enter a number or press 0 to quit: ");
            num = in.nextInt();
        }
        System.out.println("Total value of :" + sum);
    }
}
