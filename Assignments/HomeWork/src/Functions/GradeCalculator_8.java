package Functions;

import java.util.Scanner;

public class GradeCalculator_8 {

    static String displayGrade(int marks) {
        if (marks >= 91 && marks <= 100){
            return "AA";
        } else if (marks >= 81 && marks <= 90) {
            return "AB";
        } else if (marks >= 71 && marks <= 80) {
            return "BB";
        } else if (marks >= 61 && marks <= 70) {
            return "BC";
        } else if (marks >= 51 && marks <= 60) {
            return "CC";
        } else if (marks >= 41 && marks <= 50) {
            return "DD";
        } else if (marks <= 40){
            return "Fail";
        } else {
            return "Invalid Input";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your mark: ");
        int mark = in.nextInt();
        String grade = displayGrade(mark);
        System.out.println("your grade is: " + grade);
    }
}
