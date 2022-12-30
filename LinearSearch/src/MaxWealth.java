public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,2,3},
                {3,2,1}
        };
        int result = maximumWealth(accounts);
        System.out.println(result);

    }
    static int maximumWealth(int[][] accounts) {
        int aus = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            int sum = 0;

            for (int anInt : ints) {
                sum += anInt;
            }
            if (sum > aus) {
                aus = sum;
            }
        }
        return aus;
    }
}
