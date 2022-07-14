package Buoi2.simpleDuckApp.solution02.version2;

public class RedheadDuck extends Duck /*implements FlyAble, QuackAble*/{

    public RedheadDuck(){
        setQuackBehavior(new Quack());
        setFlyBehavior(new FlyWithWings());
    }
    @Override
    public void display() {
        System.out.println("Im a real Red head Duck");        
    }
}
