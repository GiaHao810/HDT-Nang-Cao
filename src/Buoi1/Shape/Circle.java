package Buoi1.Shape;
public class Circle extends Shape {

    private double radius;

    public Circle(double r){
        radius = r;
    }

    @Override
    public double getArea() {
        return radius * radius * 3.14;
    }
    
}
