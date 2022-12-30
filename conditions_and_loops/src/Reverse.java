public class Reverse {
    public static void main(String[] args) {
        int num = 234121;

        int aus = 0;

        while (num >0) {
            int rem = num % 10;
            num /= 10;

            aus = aus * 10 + rem;

        }
        System.out.println(aus);
    }
}
