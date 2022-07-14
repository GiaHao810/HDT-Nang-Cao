package Buoi1.Shape;
import java.util.Scanner;

public class InputUI {
    Scanner input = new Scanner(System.in);

    protected double showInputRadius(){
        System.out.print("Input Radius: ");
        double radius = input.nextDouble();

        return radius;
    }
}
