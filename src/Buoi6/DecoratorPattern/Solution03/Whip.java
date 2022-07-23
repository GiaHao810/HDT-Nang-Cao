package Buoi6.DecoratorPattern.Solution03;

public class Whip extends CondimentDecorator {

    public Whip(Beverage o){
        this.beverage = o;
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return "Whip";
    }
}
