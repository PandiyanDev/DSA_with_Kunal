package Polymorphism;

public class Main {
    public static void main(String[] args) {
        // if the type of reference variable is parent class == Obj is subclass or child class
        // syntax:  Prent obj = new Child();  here call depends on child().
        Shapes shape = new Shapes();
        Shapes circle = new Circle(); //  here call it child class and return from child class itself
        Shapes square = new Square(); // here call it

        circle.area();
    }
}
