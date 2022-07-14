package Buoi1.Shape;
public class TestDrive {
    public static void main(String[] args) {
        Circle circle = new Circle(24);

        Rectangle rectangle = new Rectangle(3.0, 5.0);
        
        CalculateAreas cAreas = new CalculateAreas();

        System.out.println( "Area = " + cAreas.calcArea(circle));

        System.out.println("Area = " + cAreas.calcArea(rectangle));
    }
}
