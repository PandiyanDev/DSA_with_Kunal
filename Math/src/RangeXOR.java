public class RangeXOR {
    public static void main(String[] args) {
      // range xor for a, b = xor(b)^ xor(a-1)
      int a = 3;
      int b = 9;
//      int ans = xor(b)^ xor(a-1);
//        System.out.println(ans);
//        for (int i = 0; i <= 20; i++) {
//            System.out.println("xor of "+ i +" is "+  xor(i));
//        }

        // Only  for check, will give time exceed error large numbers
        int ans2 = 0;
        for (int i = a; i <=b ; i++) {
            ans2 ^= i;
        }
        System.out.println(ans2);
    }


    // this gives xor from 0 to a

    static int xor(int a) {
        if (a % 4 == 0){
            return a;
        }
        if (a % 4 == 1){
            return 1;
        }if (a % 4 == 2){
            return a + 1;
        }
        return 0;

    }



}
