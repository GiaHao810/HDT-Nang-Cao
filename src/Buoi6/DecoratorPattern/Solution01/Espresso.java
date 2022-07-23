package Buoi6.DecoratorPattern.Solution01;

public class Espresso extends Beverage {

    public Espresso(){
        description = "Espresso Coffee";
    }
    @Override
    public double cost() {
        return 1.99;        
    }
}
