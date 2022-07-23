package Buoi6.DecoratorPattern.Solution03;

public class HouseBlend extends Beverage{
    @Override
    public double cost() {
        return 2.99;
    }

    @Override
    public String getDescription() {
        return "House Blend";
    }
}
