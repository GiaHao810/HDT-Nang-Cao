package Buoi6.DecoratorPattern.Solution01;

public class HouseBlend extends Beverage{

    public HouseBlend(){
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.99;
        
    }
}
