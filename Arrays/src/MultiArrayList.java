import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // syntax
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(); // here Initialize integer Array list

        // Initialisation and matrix 3,3
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

//        System.out.println(list); //  return [[],[],[]]

//        System.out.println(list.size());
        // adding data or elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
    }
}
