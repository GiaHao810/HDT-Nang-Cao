package Buoi6.DecoratorPattern.Solution03;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage o){
        this.beverage = o;
    }

    @Override
    public double cost() {
        return 0.50 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return "Mocha";
    }
}
