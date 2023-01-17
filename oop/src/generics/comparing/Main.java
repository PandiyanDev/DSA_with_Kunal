package generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student pandi = new Student(51, 89.3f);
        Student raj = new Student(45, 91.5f);
        Student vimal = new Student(56, 90.5f);
        Student kunal = new Student(32, 85.5f);
        Student kumar = new Student(30, 95.5f);

        Student[] list = {pandi, raj, vimal, kunal, kumar};

        System.out.println(Arrays.toString(list));
        Arrays.sort(list, (o1, o2) -> -(int) (o1.marks - o2.marks));
        System.out.println(Arrays.toString(list));

//        if (pandi.compareTo(raj) < 0) {
//            System.out.println(pandi.compareTo(raj));
//            System.out.println("Raj has more marks");
//        }
    }
}
