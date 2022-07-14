package Buoi2.simpleDuckApp.solution01.version2;

import Buoi2.simpleDuckApp.solution02.version1.FlyAble;
import Buoi2.simpleDuckApp.solution02.version1.QuackAble;

public class RedheadDuck extends Duck implements FlyAble, QuackAble{

    @Override
    public void quack() {
        
    }

    @Override
    public void fly() {
        
    }

    @Override
    public void display() {
        System.out.println("Im a real Red head Duck");        
    }
    
}
