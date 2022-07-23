package Buoi6.DecoratorPattern.Solution03;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    @Override
    public double cost() {
        double cost = 0;
        return cost += beverage.cost();
    }

    public abstract String getDescription();
}
