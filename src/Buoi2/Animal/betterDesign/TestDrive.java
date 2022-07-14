package Buoi2.Animal.betterDesign;

public class TestDrive {
    public static void main(String[] args) {
        Mamal cat = new Cat();
        Mamal dog = new Dog();
        Mamal bat = new Bat();

        System.out.println("Cat: " + cat.makeNoise());
        System.out.println("Dog: " + dog.makeNoise());
        //System.out.println("Bat: " + bat.makeFly());
    }
}
