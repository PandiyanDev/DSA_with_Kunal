package Strings;

import java.util.ArrayList;

public class Ascii {
    public static void main(String[] args) {
//        System.out.println();
        System.out.println(subseqREAscii("", "abc"));

    }

    static void subseqAscii(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subseqAscii(p + ch,up.substring(1));
        subseqAscii(p, up.substring(1));
        subseqAscii(p + (ch+0), up.substring(1));
    }
    static ArrayList<String> subseqREAscii(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }

        char ch = up.charAt(0);

        ArrayList<String> first = subseqREAscii(p + ch,up.substring(1));
        ArrayList<String> second = subseqREAscii(p, up.substring(1));
        ArrayList<String> thrid = subseqREAscii(p + (ch+0), up.substring(1));

        first.addAll(second);
        first.addAll(thrid);
        return first;
    }
}
