import java.util.Scanner;
// intermediate level
// 2. calculate electricity bill.
public class ElectricityBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your consumed electricity unit upto 500 units");

        int unit = in.nextInt();
        float bill = 1;

        if (unit == 0) {
            System.out.println("Your Electricity bill is " + 0);
        } else if (unit <= 200) {
            bill *= 2.25;
            System.out.println("Your Electricity bill is " + bill);
        } else if (unit <= 400) {
            int initial = unit - 200;
            float first_tariff = (float) (200 * 2.25);
            float remaining_tariff = (float) (initial * 4.50);
            bill = first_tariff + remaining_tariff;
            System.out.println("Your Electricity bill is " + bill);
        } else if (unit <= 500) {
            int initial = unit - 200;
            int last = initial - 200;
            float first_tariff = (float) (200 * 2.25);
            float second_tariff = (float) (200 * 4.50);
            float remaining_tariff = (float) (last * 6);
            bill = first_tariff + second_tariff + remaining_tariff;
            System.out.println("Your Electricity bill is " + bill);
        }
    }
}
