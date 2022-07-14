package Buoi2.simpleDuckApp.solution02.version2;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("This duck can't quack");
    }
}
