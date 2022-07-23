package Buoi6.DecoratorPattern.Solution03;

public class Milk extends CondimentDecorator{

    public Milk(Beverage o){
        this.beverage = o;
    }
    
    @Override
    public double cost() {
        return 0.30 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return "Milk";
    }
}
