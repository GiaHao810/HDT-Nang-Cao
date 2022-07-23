package Buoi6.DecoratorPattern.Solution03;

public class DarkRoast extends Beverage{
    @Override
    public double cost() {
        return 1.99;
    }

    @Override
    public String getDescription() {
        return "Dark Roast";
    }
}
