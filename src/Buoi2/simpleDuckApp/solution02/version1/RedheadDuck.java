package Buoi2.simpleDuckApp.solution02.version1;

public class RedheadDuck extends Duck implements FlyAble, QuackAble{

    @Override
    public void fly() {
        super.fly();
    }

    @Override
    public void quack() {
        super.quack();
    }

    @Override
    public void display() {
        System.out.println("Im a real Red head Duck");        
    }
    
}
