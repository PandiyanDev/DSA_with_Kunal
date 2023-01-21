package Functions;

// Write a program to print the circumference and area of a circle of radius entered by user
// by defining your own method.
import java.util.Scanner;

public class AreaOfCircle_6 {

    static double area(int radius){
        return Math.PI * radius * radius;
    }

    static double circumference(int radius){
        return Math.PI * 2 * radius;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your circle radius: ");
        int radius = in.nextInt();
        double areaOfCircle = area(radius);
        double circumferenceOfCircle = circumference(radius);

        System.out.printf("Area of circle is: %.3f", areaOfCircle);
        System.out.println("");
        System.out.printf("circumference of circle is: %.3f", circumferenceOfCircle);
    }
}
