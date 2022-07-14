package Buoi1.Animal;

public class Dog implements IEat, IMakeNoise{
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void makeNoise() {
        System.out.println("Dog is making noise");
    }
}
