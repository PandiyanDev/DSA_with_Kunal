package Polymorphism;

public class Circle extends Shapes{
    // this will run when obj of Circle is created
    // hence it is overriding the parent class
    @Override  // this is called annotation. This is overriding child(Circle) class because already same constructor declared in parent(Shapes) class
    void area() {
        System.out.println(" Area is pie * r * r");
    }

    // suppose you have to change constructor name. It is not overriding.
    // example
//    @Override //  here got an error.
    void area2(){
        System.out.println("AREA is pie * R* R");
    }

}
