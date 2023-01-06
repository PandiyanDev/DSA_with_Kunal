import java.util.*;
public class LCMandHCF {
    public static void main(String args[]) {
        int a, b;
        System.out.println("Enter the a and b value");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        //copy the a,b values into x,y
        int x = a;
        int y = b;
        while (x != y) {
            if (x > y) {
                x = x - y;
            } else {
                y = y - x;
            }
        }
        /* when we exit the while loop.we get the two value x
        and y which both are equals and this is our HCF(GCD)result.
        */
        System.out.println("HCF of a&b=" + x);
        //Now Apply the Formula of LCM
        System.out.println("LCM of a&b=" + ((a * b)) / x);
    }
}