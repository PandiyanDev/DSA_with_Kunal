package easy;

public class Factorial {
    public static void main(String[] args) {
//        int ans = fact(5);
        int ans = sum(5);
        System.out.println(ans);

    }
    // factorial which product of 1 to n
    static int fact(int n) {
        if ( n<= 1) {
            return 1;
        }
        return n * fact(n-1);
    }
    // if you want sum of 1 to n
    static int sum(int n) {
        if ( n<= 1) {
            return 1;
        }
        return n + sum(n-1);
    }
}
