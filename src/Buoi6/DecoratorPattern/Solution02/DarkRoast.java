package Buoi6.DecoratorPattern.Solution02;

public class DarkRoast extends Beverage{

    public DarkRoast(){
        description = "Dark Roast Coffee";
    }


    @Override
    public double cost() {
        double cost = 0;

        cost = super.cost() + 2.99;

        return cost;
    }
}
