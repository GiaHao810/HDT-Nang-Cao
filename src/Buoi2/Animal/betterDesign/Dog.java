package Buoi2.Animal.betterDesign;

public class Dog extends Mamal{

    DogNoise behavior = new DogNoise();

    @Override
    public String makeNoise() {
        return behavior.makeNoise();
    }
}
