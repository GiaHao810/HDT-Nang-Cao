package Buoi2.simpleDuckApp.solution02.version2;

public class DecoyDuck extends Duck {

    public DecoyDuck(){
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }
    @Override
    public void display() {
        System.out.println("Im a real Decoy Duck");        
    }
    
}
