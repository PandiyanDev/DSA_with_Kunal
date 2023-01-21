package ConditionLoops;

public class SurfaceArea {
    public static void main(String[] args) {
        // Curved Surface Area Of Cylinder and formula is (2* PI *r^2) + (2 * PI * r * h)
        // if you want to learn more about Surface area of cylinder
        // click the link -> https://www.khanacademy.org/math/geometry/hs-geo-solids/hs-geo-solids-intro/v/cylinder-volume-and-surface-area
        int Cicleradius = 6;
        int RectHeight = 12;
        double areaOfSurfaceCylinder= (2 * Math.PI * Math.pow(Cicleradius, 2)) + (2 * Math.PI * Cicleradius * RectHeight);
        System.out.printf("Curved Surface Area of Cylinder is: %.3f", areaOfSurfaceCylinder);
        System.out.println();

        // Total Surface Area Of Cone and formula is (PI * r^2) + (PI * r *l)
        // if you want to learn more about surface are of cube
        // click the link -> https://www.cuemath.com/measurement/surface-area-of-cone/
        int ConeRadius = 12;
        int ConeLength = 15;
        double TotalSurfaceAreaOfCone = (Math.PI * Math.pow(ConeRadius, 2)) + (Math.PI * ConeLength * ConeRadius);
        System.out.printf("Total Surface Area Of Cone is: %.3f", TotalSurfaceAreaOfCone);
        System.out.println();

        // Total Surface Area of Cube and formula is 4 a^2
        // link -> https://www.cuemath.com/measurement/surface-area-of-cube/
        int SixFaceOfCube = 6;
        double TotalSurfaceAreaOfCube = 6 * Math.pow(SixFaceOfCube, 2);
        System.out.println("Total Surface Area of Cube is: " + TotalSurfaceAreaOfCube);
    }
}
