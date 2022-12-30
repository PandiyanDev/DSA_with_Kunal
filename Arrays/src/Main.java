public class Main {
    public static void main(String[] args) {
        // Q: Store a roll number
        int a = 19;

        // Q: Store a person's name
        String name ="Sundarapandiyan";

        // Q: Store 4 numbers
        int num1 = 34;
        int num2 = 54;
        int num3 = 55;
        int num5 = 65;

        // this is a wrong way store numbers
        // You can use Array stored multiple numbers

        /*
            syntax of Array

           datatype[] reference_variable = new datatype[size]
           e.g -> int[] numbers = new int[5]
           Here int datatype. So Here stored only integer number
         */
        int[] numbers = new int[5];
        numbers[0] = 34; // here load the value at index o
        numbers[1] = 45; // Here load the value at index 1
//        System.out.println(numbers[4]);  // Remaining value of numbers 0

        String[] fruit = new String[3];
        System.out.println(fruit[0]); // return null. Because we can't pass or store values

        fruit[0] = "Banana";
        fruit[1] = "Grapes";
        System.out.println(fruit[0]); // now we got banana. Because we could stored.
    }
}