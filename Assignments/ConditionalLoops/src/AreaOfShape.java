public class AreaOfShape {
    public static void main(String[] args) {

        // find area of circle
        // formula for area circle is = pi r^2
        int radius  = 5;
        double areaOfCircle = Math.PI * radius * radius;
//        System.out.println("Area of Circle is: " + areaOfCircle);

        // find area of triangle
        // Formula for area of triangle is = 1/2 * height * base
        int base = 5;
        int height = 5;
        float areaOfTriangle = (float) (height * base)/2;
//        System.out.println("Area of Triangle is: " + areaOfTriangle);

        // find area of rectangle
        // Formula for area of rectangle is = width * length
        int length  = 42;
        int width = 28;
        int areaOfRectangle = length * width;
//        System.out.println("Area of Rectangle is: " + areaOfRectangle);

        // find area of isosceles triangle
        // Formula is (height * base) / 2
        // this same as triangle but difference is isosceles triangle both side equal length and angle.
        // use same height and base
        float areaOfIsoscelesTriangle = (float) (height * base)/2;
//        System.out.println("Area of Isosceles triangle is: " + areaOfIsoscelesTriangle);

        // find area of parallelogram
        // formula is base * height
        int para_base = 20;
        int para_height = 30;
        int areaOfParallelogram = para_height * para_base;
//        System.out.println("Area of parallelogram is: " + areaOfParallelogram);

        // find area of Rhombus
        // formula is half of product of diagonal of length & height i.e. (p * q) / 2
        int length_diagonal = 54;
        int height_diagonal = 45;
        float areaOfRhombus = (float) (length_diagonal * height_diagonal) / 2;
//        System.out.println("Area of Rhombus is: " + areaOfRhombus);

        // find area of Equilateral triangle
        // formula is = (sqrt(3)/ 4) * side(a)^2 here 3 side are equal
        int side = 34;
        float areaOfEquilateralTriangle = (float) ((float) (Math.sqrt(3) / 4) * Math.pow(side, 2));
        System.out.println("Area of Equilateral Triangle is: " + areaOfEquilateralTriangle);
    }
}