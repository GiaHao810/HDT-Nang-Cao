package Buoi6.DecoratorPattern.Solution01;

public class DarkRoast extends Beverage{

    public DarkRoast(){
        description = "Dark Roast Coffee";
    }
    @Override
    public double cost() {
        return 1.99;        
    }
}
