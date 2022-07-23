package Buoi6.DecoratorPattern.Solution03;

public class Soy extends CondimentDecorator{

    public Soy(Beverage o){
        this.beverage = o;
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return "Soy";
    }
}
