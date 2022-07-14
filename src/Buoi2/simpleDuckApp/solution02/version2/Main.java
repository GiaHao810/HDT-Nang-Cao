package Buoi2.simpleDuckApp.solution02.version2;

public class Main {
    public static void main(String[] args) {
        Duck mallarDuck = new MallardDuck();
        RubberDuck rubberDuck = new RubberDuck();
        DecoyDuck decoyDuck = new DecoyDuck();
        RedheadDuck redheadDuck = new RedheadDuck();


        // System.out.println("Mallar Duck");
        // mallarDuck.performFly();
        // mallarDuck.performQuack();

        // System.out.println("");

        // System.out.println("Rubber Duck");
        // rubberDuck.performFly();
        // rubberDuck.performQuack();

        // System.out.println("");

        // System.out.println("Decoy Duck");
        // decoyDuck.performFly();
        // decoyDuck.performQuack();

        // System.out.println("");


        // System.out.println("Red head Duck");
        // redheadDuck.performFly();
        // redheadDuck.performQuack();


        ModelDuck model = new ModelDuck();

        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
