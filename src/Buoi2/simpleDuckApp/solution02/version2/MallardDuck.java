package Buoi2.simpleDuckApp.solution02.version2;

public class MallardDuck extends Duck /*implements FlyAble, QuackAble*/ {

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("Im a real Mallard Duck");
        
    }
    
}
