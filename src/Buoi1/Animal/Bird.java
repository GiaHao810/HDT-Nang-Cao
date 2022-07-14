package Buoi1.Animal;

public class Bird implements IEat, IFly, IMakeNoise{
    @Override
    public void eat() {
        System.out.println("Bird is eating");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }

    @Override
    public void makeNoise() {
        System.out.println("Bird is making noise");
    }
}
