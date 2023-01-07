public class Main {
    public static void main(String[] args) {
        String a = "Sundarapandiyan";
        String b = "Sundarapandiyan";
        System.out.println(a);
        a = "Pandiyan"; // recreating object. I am not changing object.
        System.out.println(a);
        System.out.println(b);

    }
}