package Buoi6.DecoratorPattern.Solution03;

public class TestDrive {
    public static void main(String[] args) {
        Beverage Decaf = new Decaf();

        Decaf = new Milk(Decaf);

        System.out.println("Decaf + Milk: " + Decaf.cost());

        Beverage Espresso = new Espresso();

        Espresso = new Whip(Espresso);

        System.out.println("Espresso + Whip: " + Espresso.cost());
    }
}
