import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Pandiyan";
        char target = 'y';
//        System.out.println(search(name, target));

        //  write name into array at each letter.
        System.out.println(Arrays.toString(name.toCharArray()));
    }

    // find the target value present in the name or not?
    static boolean search(String str, char target){
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

}
