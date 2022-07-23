package Buoi6.DecoratorPattern.Solution02;

public abstract class Beverage {
    String description;
    boolean milk;
    boolean soy;
    boolean mocha;
    boolean whip;

    public String getDescription() {
        return description;
    }
    
    public double cost(){
        double cost = 0;

        if(isMilk()){
            cost += 0.99;
        } else if(isMocha()){
            cost += 1.49;
        } else if(isSoy()){
            cost += 2.09;
        } else if(isWhip()){
            cost += 2.99;
        }

        return cost;
    }

    public boolean isMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean isSoy() {
        return soy;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public boolean isMocha() {
        return mocha;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    public boolean isWhip() {
        return whip;
    }

    public void setWhip(boolean whip) {
        this.whip = whip;
    }

    
}
