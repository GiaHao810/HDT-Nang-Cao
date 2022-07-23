package Buoi6.DecoratorPattern.Solution01;

public class Decaf extends Beverage{

    public Decaf(){
        description = "Decaf Coffee";
    }
    @Override
    public double cost() {
        return 0.59;        
    }
}
