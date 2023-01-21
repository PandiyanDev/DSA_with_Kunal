package Functions;

import java.util.Scanner;

// A person is eligible to vote if his/her age is greater than or equal to 18.
// Define a method to find out if he/she is eligible to vote.
public class IsVote_3 {

    static boolean vote(int age){
        return (age >= 18);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = in.nextInt();
        boolean result = vote(age);
        if (result) {
            System.out.println("That person has permit to vote in the election");
        } else {
            System.out.println("That person has not eligible to vote in the election");
        }
    }
}
