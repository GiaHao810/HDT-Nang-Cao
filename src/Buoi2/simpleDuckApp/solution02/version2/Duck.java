package Buoi2.simpleDuckApp.solution02.version2;

public abstract class Duck {
    public void quack() {
        System.out.println("Quacking...");
    }

    public  void swim() {
        System.out.println("Swimming...");
    }

    public abstract void display();

    public void fly(){
        System.out.println("Flying...");
    }
}
