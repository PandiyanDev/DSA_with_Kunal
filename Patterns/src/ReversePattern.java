public class ReversePattern {

    public static void main(String[] args) {
        /*  here reverse pattern n = rows
          # # # #
          # # #
          # #
          #
         */
        pattern3(5);
    }
    static void pattern3(int n) {
        for (int row= 1; row <=n ; row++) {
            for (int col = 1; col <=  n - row + 1 ; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

}
