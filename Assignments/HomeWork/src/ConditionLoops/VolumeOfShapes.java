package ConditionLoops;

public class VolumeOfShapes {
    public static void main(String[] args) {
        // Volume Of Cone Java Program and formula is V = (PI * radius^2 * height )/3
        int radius = 5;
        int height = 5;
        double volumeOfCone = (Math.PI * Math.pow(radius,2)* height) / 3;
        System.out.printf("Volume of cone is: %.4f", volumeOfCone);
        System.out.println();

        // Volume Of Cylinder and formula is V = PI * r^2 * h
        int CyRadius = 8;
        int CyHeight = 6;
        double volumeOfCylinder= Math.PI * Math.pow(CyRadius,2)* CyHeight;
        System.out.printf("Volume of cylinder is: %.4f", volumeOfCylinder);
        System.out.println();

        // Volume Of Sphere and formula is V= 4/3 * PI * R^3
        int SpRadius = 6;
        double volumeOfSphere = (4* Math.PI * Math.pow(SpRadius,3)) / 3;
        System.out.printf("Volume of cone is: %.4f", volumeOfSphere);
        System.out.println();

        // Volume Of Right Rectangular Pyramid formula is V = (length * width * height) / 3
        int RectLength = 5;
        int RectWidth = 4;
        int RectHeight = 8;
        float volumeOfRightRectangularPyramid = (RectHeight * RectLength * RectWidth) / 3;
        System.out.printf("Volume of Right Rectangular Pyramid is: %.3f", volumeOfRightRectangularPyramid);
        System.out.println();

        // Volume Of Prism
        // Generally volume of prism is V = base_Area * height
        // Here base_area depends on shape. For example square -> area of square.
        // And also height which the shape decide whether height or length
        // Volume of SquarePrism
        int SqBase  = 5;
        int Sqlength = 10;
        int volumeofSquarePrism = (int) (Math.pow(SqBase, 2) * Sqlength);
        System.out.println("volume of Square Prism is: " + volumeofSquarePrism);

        // Volume of Rectangular prism and formula V= l * W * h
        // we take values from pyramid
        int volumeOfRectangularPrism = RectHeight * RectLength * RectWidth;
        System.out.println("Volume Of Rectangular Prism is: " + volumeOfRectangularPrism);

        // Volume of Triangular prism formula is V = (1/2) * base * height * length
        int triBase = 5;
        int triHeight = 10;
        int triLength = 15;
        float VolumeOfTriangularPrism =  (triBase * triHeight * triLength) / 2;
        System.out.println("Volume of Triangular Prism is: " + VolumeOfTriangularPrism);
    }
}
