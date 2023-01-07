package easy;

public class Nto1 {
    public static void main(String[] args) {
        funBoth(5);
        // space complexity :  O(n)
        concept(5);
    }

    //concept
    static void concept(int n) {
        if (n == 0){
            return ;
        }
        System.out.println(n);
        // concept(n--); it return infinity loop run and got an error. because first passing number the subtracting. So got an error.
        concept(--n);
        // n-- vs --n  it represent same n = n -1 but difference is which first passing the function number(n) or subtracting number(n-1)
    }
    static void fun(int n) {
        if (n == 0){
            return ;
        }
        System.out.println(n);
        fun(n-1);
    }
    static void funRev(int n) {
        if (n == 0){
            return ;
        }
        funRev(n-1);
        System.out.println(n);
    }
    static void funBoth(int n) {
        if (n == 0){
            return ;
        }
        System.out.println(n);
        funBoth(n-1);
        System.out.println(n);
    }
}
