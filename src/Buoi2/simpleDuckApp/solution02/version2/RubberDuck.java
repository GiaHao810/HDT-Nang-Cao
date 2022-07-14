package Buoi2.simpleDuckApp.solution02.version2;

public class RubberDuck extends Duck /*implements QuackAble*/{

    public RubberDuck(){
        quackBehavior = new Speak();
        flyBehavior = new FlyNoWay();
    }
    @Override
    public void display() {
        System.out.println("Im a real rubber duck");
    }
}
