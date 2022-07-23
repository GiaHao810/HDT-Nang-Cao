package Buoi6.DecoratorPattern.Solution02;

public class HouseBlend extends Beverage{

    public HouseBlend(){
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        double cost = 0;

        cost = super.cost() + 2.99;

        return cost;
    }
}
