package Buoi2.Animal.diSolution;

public class Main {
    public static void main(String[] args) {


        //Constructor injection
        Mammal dog = new Mammal(new DogNoise());

        dog.makeNoise();

        Mammal cat = new Mammal();
        cat.setSpeaker(new CatNoise());

        cat.makeNoise();
    }
}
