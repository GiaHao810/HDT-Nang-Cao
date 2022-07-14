package Buoi2.Animal.badDesign;

public class TestDrive {
    public static void main(String[] args) {
        Mamal dog = new Dog();
        Mamal cat = new Cat();

        System.out.println("Cat: " + cat.makeNoise());
        System.out.println("Dog: " + dog.makeNoise());
    }
}
