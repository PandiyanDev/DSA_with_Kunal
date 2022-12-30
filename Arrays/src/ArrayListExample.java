import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(4); // here Initial capacity only 4 you can add more and get
//
//        list.add(23);
//        list.add(43);
//        list.add(56);
//        list.add(97);
//        list.add(898);
//        list.add(6867384);
//
//        System.out.println(list);

        // get from user store values
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        System.out.println(list);

        // get item at index reference
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // here get keyword use for index reference with value
        }
        System.out.println(list);
    }
}
