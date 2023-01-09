package Strings;

public class Stream {
    public static void main(String[] args) {
        System.out.println(skipAppNotApple("abcapplcadh"));
    }

    // pass the string with itself
    static void skip(String p, String up) {
        // p -> processed and up -> unprocessed
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }
    }

    // return  type function same question
    static String skipReturn(String up) {
        // up -> unprocessed
        if (up.isEmpty()) {
            return "";
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
            return skipReturn(up.substring(1));
        } else {
            return ch  + skipReturn(up.substring(1));
        }
    }

    static String skipApple(String up) {
        // up -> unprocessed
        if (up.isEmpty()) {
            return "";
        }


        if (up.startsWith("apple")) {
            return skipApple(up.substring(5));
        } else {
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }

    static String skipAppNotApple(String up) {
        // up -> unprocessed
        if (up.isEmpty()) {
            return "";
        }


        if (up.startsWith("app")  &&  !up.startsWith("apple")) {
            return skipAppNotApple(up.substring(3));
        } else {
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }
}
