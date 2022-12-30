public class CountNums {
    public static void main(String[] args) {

        int n = 434234;

        int count = 0;
        while (n > 0) {
            int rem = n% 10;
            if (rem == 4) { // Here we know which number going to be count
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}
