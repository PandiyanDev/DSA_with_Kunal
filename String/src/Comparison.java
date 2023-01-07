public class Comparison {
    public static void main(String[] args) {
        String a = "Pandiyan";
        String b = "Pandiyan";

        // comparison ==
//        System.out.println(a == b); // because different variable and pointing to same value.
        String name1 = new String("Pandiyan");
        String name2 = new String("Pandiyan");

        // comparison (== -> comparator)
//        System.out.println(name1 == name2);  // because different variable and pointing to different value

        // suppose to compare both and get true
        // this is method
        System.out.println(name1.equals(name2)); // here check only value not variable.

        // index
        System.out.println(name1.charAt(0)); // get index 0 of name1 value.
    }
}
