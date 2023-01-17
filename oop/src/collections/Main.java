package collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        list2.add(34);
        list2.add(45);
        list2.add(89);

        System.out.println(list2);

        List<Integer> vector = new Vector<>();
        vector.add(45);
        vector.add(54);
        vector.add(23);
        vector.add(34);
        System.out.println(vector);
    }
}
