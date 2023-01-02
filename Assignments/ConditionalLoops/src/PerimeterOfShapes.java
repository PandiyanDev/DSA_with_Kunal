public class PerimeterOfShapes {
    public static void main(String[] args) {
        // Perimeter Of Circle and formula is P = 2 * PI* r
        int radius = 5;
        double perimeterOfCircle = (float) 2 * Math.PI * radius;
        System.out.printf("Perimeter Of Circle is %.3f: ", perimeterOfCircle);
        System.out.println();

        // Perimeter Of Equilateral Triangle and formula is P = 3 * a (side)
        int side = 5;
        int perimeterOfEquilateralTriangle = 3 * side;
        System.out.println("Perimeter Of Equilateral Triangle is: " + perimeterOfEquilateralTriangle);

        // Perimeter Of Parallelogram and formula is P = 2 (a (side)+ b(base))
        int ParaSide = 5;
        int ParaBase = 5;
        int perimeterOfParallelogram = 2 * (ParaBase + ParaSide);
        System.out.println("Perimeter Of Parallelogram is: " + perimeterOfParallelogram);

        // Perimeter Of Rectangle and formula is P = 2( l(length) + w(width))
        int RectLength = 5;
        int RectWidth = 5;
        int perimeterOfRectangle = 2 * (RectLength + RectWidth);
        System.out.println("Perimeter Of Rectangle is: " + perimeterOfRectangle);

        // Perimeter Of Square and formula is P = 4a
        int SquareSide = 5;
        int perimeterOfSquare = 4 * SquareSide;
        System.out.println("Perimeter Of Square is: " + perimeterOfSquare);

        // Perimeter Of Rhombus
        int RhombusSide = 5;
        int perimeterOfRhombus = 4 * RhombusSide;
        System.out.println("Perimeter Of Rhombus is: " + perimeterOfRhombus);
    }
}
