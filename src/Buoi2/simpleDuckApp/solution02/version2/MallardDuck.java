package Buoi2.simpleDuckApp.solution02.version2;

public class MallardDuck extends Duck implements FlyAble, QuackAble{
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
        System.out.println("Im a real Mallard Duck");
        
    }
    
}
