public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,524,6,70,7892};
        int aus = findNumbers(nums);
        System.out.println(aus);

    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }


    static boolean even(int num){
        int numberOfDigit = digit(num);
        return numberOfDigit % 2 == 0;
    }

    static int digit(int num) {
        int count = 0;
        while (num > 0){
            count += 1;
            num = num /10;
        }
        return count;
    }
}
