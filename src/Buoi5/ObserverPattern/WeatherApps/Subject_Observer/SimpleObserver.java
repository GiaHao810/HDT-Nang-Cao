package Buoi5.ObserverPattern.WeatherApps.Subject_Observer;

public class SimpleObserver implements Observer {
    private int value;
    private Subject simpleSubject;
    
    public SimpleObserver(Subject simpleSubject) {
        this.simpleSubject = simpleSubject;
        simpleSubject.registerObsever(this);
    }

    @Override
    public void update(int value) {
        this.value = value;
        display();
    }

    public void display(){
        System.out.println("Value: " + value);
    }

    
}
