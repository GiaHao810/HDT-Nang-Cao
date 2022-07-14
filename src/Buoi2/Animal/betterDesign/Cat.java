package Buoi2.Animal.betterDesign;

public class Cat extends Mamal{

    CatNoise behavior = new CatNoise();

    @Override
    public String makeNoise() {
        return behavior.makeNoise();
    }
}
