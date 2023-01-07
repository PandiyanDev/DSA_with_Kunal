import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Sundarapandiyan";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.indent(3)); // To print with indentation
        System.out.println(name.indexOf('a'));
        System.out.println(name.getClass());
        System.out.println("Sund ara pandi yan".strip());
        System.out.println(Arrays.toString("Sund ara pandi yan".split(" ")));
    }
}
