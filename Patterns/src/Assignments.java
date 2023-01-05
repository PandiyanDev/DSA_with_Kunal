public class Assignments {
    public static void main(String[] args) {
//        pattern6(5);
//        pattern7(5);
//        pattern8(5);
//        pattern9(7);
//        pattern10(5);
//        pattern11(5);
//        pattern12(5);
//        pattern13(5);
//        pattern14(5);
        pattern15(5);
    }

    static void pattern6(int n) {
        for (int row = 0; row <= n; row++) {
//            int noOfSpace = n-row;
            for (int s = 0; s < n-row; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col <= row; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void pattern7(int n) {
        for (int row = 0; row <= n; row++) {
            for (int s = 0; s < row; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col <= n - row-1; col++) {
                System.out.print("*"+"");
            }

            System.out.println();
        }
    }

    static  void pattern8(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < 2*i-1 + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static  void pattern9(int n){
        int space = 1;
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <=space; j++) {
                System.out.print(" ");
            }
            space++;
            for (int k = 1; k < 2*(n-i)-1 + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static void pattern10(int n) {
        for (int row = 1; row <= n ; row++) {
            for (int s = n; s >=row; s--) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern11(int n) {
        for (int row = 0; row < n; row++) {
            int toltalColsInRow = row > n ? row :n-row;
            int noOfSpaces = n - toltalColsInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < toltalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern12(int n) {
        for (int row = 0; row <= n-1 ; row++) {
            for (int s = 0; s < row; s++) {
                System.out.print(" ");
            }
            for (int col = row; col <= n-1; col++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
        for (int row = n-1; row >= 0; row--) {
            for (int s = 0; s < row ;s++)
            {
                System.out.print(" ");
            }
            for (int col = row; col <= n-1; col++)
            {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
    }
    static void pattern13(int n) {
        for (int row = 1; row <= n; row++) {
            for (int s = row; s < n; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= (2 * row - 1); col++) {
                if (col == 1 || row == n || col == (2 * row - 1)){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    static void pattern14(int n) {
        for (int row = n; row >= 1; row--) {
            for (int s = row; s < n; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= (2 * row - 1); col++) {
                if (col == 1 || row == n || col == (2 * row - 1)){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    
    static void pattern15(int n) {
        for (int i=1; i<= n ; i++) {
            for (int j = n; j > i ; j--) {
            System.out.print(" ");
            }
            System.out.print("*");
            for (int k = 1; k < 2*(i -1) ;k++) {
                System.out.print(" ");
            }
            if( i==1) {
                System.out.println("");
            } else {
                System.out.println("*");
            }
        }
        for (int i=n-1; i>= 1 ; i--) {
            for (int j = n; j > i ; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k = 1; k < 2*(i -1) ;k++) {
                System.out.print(" ");
            }
            if( i==1)
                System.out.println("");
            else
                System.out.println("*");
        }
    }

}

