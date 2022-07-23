package Buoi6.DecoratorPattern.Solution02;

public class Decaf extends Beverage{

    public Decaf(){
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        double cost = 0;

        cost = super.cost() + 0.99;

        return cost;
    }
}
