package Strings;

import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
//        pad("", "12");
//        System.out.println(padRet("", "23"));
        System.out.println(phonepadCode("", "23"));
    }

    static void pad(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0'; // this will convert '2' into 2
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char)('a' + i);
            pad(p + ch, up.substring(1));
        }
    }

    static ArrayList<String> padRet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        int digit = up.charAt(0) - '0'; // this will convert '2' into 2
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char)('a' + i);
            list.addAll(padRet(p + ch, up.substring(1)));
        }
        return list;
    }


    // leetcode problem -- 17. https://leetcode.com/problems/letter-combinations-of-a-phone-number/
    static ArrayList<String> phonepadCode(String p, String up) {
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        int digit = up.charAt(0) - '0';
        if (digit == 7 || digit == 9) {
            for (int i = (digit - 1) * 4; i < digit * 4; i++) {
                char ch = (char) ('a' + i);
                list.addAll(phonepadCode(p+ch, up.substring(1)));
            }
        }else {
            for (int i = (int) ((digit - 2) * 1.5); i < (int)(digit * 1.5); i++) {
                char ch = (char) ('a' + i);
                list.addAll(phonepadCode(p+ch, up.substring(1)));
            }
        }
        return list;
    }
}
