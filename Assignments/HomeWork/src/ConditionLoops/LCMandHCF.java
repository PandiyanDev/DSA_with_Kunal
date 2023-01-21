package ConditionLoops;

import java.util.*;
public class LCMandHCF {
    public static void main(String args[]) {
        int a, b;
        System.out.println("Enter the a and b value");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();

        System.out.print("HCF of a&b=" + hcf(a, b));
        System.out.print("LCM of a&b=" + lcm(a,b));
    }

    static int hcf(int a, int b){
        if (a == 0 ){
            return b;
        }
        return  hcf(b%a, a);
    }

    static int lcm(int a, int b){
        return a * b / hcf(a, b);
    }

}