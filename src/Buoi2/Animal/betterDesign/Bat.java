package Buoi2.Animal.betterDesign;

public class Bat extends Mamal{

    BatFly behavior = new BatFly();

    @Override
    public String makeNoise() {
        return null;
    }

    public String makeFly() {
        return behavior.fly();
    }
}
