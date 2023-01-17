package exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
//            int c = a / b;
//            divide(a,b);
            String name = "Sundar";
            if (name.equals("Sundar")){
                throw new MyException("name is Sundar");
            }
        }catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("this is normal exception");
        } finally {
            System.out.println("this will always execute");
        }

    }

    // throws means declaring error exception
    static int divide(int a, int b) throws ArithmeticException{
        if (b == 0){
            throw new ArithmeticException("Please do not divide by zero");
        }
        return a/b;
    }

}
