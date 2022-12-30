import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);
//
        //type casting
//        int num2 = (int)(45.34f);
//        System.out.println(num2);

        // automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte) (a); //257 % 256 = 1


//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = ((a*b) / c);
//        System.out.println(d);
//
//        byte number = 127;
//        System.out.println(number);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 5000;
        float f = 23.234f;
        double d = 0.34342;
        double result = (f * b) +  (i /c) - (d * s);
        //float + int - double = double
        System.out.println((f * b) + " " + (i /c) +" " + (d * s));
        System.out.println(result);
    }
}
