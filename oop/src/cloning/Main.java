package cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human sundar = new Human(28, "Sundarapandiyan");
//        Human twin = new Human(sundar);

        Human twin = (Human)sundar.clone();
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] =100;
        // here copy from twin
        // this is shallow copy because we initialize twin only not sundar.
        System.out.println(Arrays.toString(sundar.arr));
        // this is deep copy
        System.out.println(Arrays.toString(twin.arr)); // twin will be change


    }
}
