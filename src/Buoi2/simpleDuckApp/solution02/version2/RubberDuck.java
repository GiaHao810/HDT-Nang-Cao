package Buoi2.simpleDuckApp.solution02.version2;

public class RubberDuck extends Duck implements QuackAble{

    @Override
    public void quack() {
        super.quack();
    }

    @Override
    public void display() {
        System.out.println("Im a real rubber duck");
    }
}
