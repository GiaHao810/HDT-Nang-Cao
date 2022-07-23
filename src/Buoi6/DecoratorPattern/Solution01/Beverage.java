package Buoi6.DecoratorPattern.Solution01;
public abstract class Beverage {
    String description;

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
