package Buoi6.DecoratorPattern.Solution03;

public class Espresso extends Beverage{
    @Override
    public double cost() {
        return 3.99;
    }

    @Override
    public String getDescription() {
        return "Espresso";
    }
}
