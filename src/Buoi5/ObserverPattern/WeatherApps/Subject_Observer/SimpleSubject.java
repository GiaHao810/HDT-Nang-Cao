package Buoi5.ObserverPattern.WeatherApps.Subject_Observer;

import java.util.ArrayList;
import java.util.List;

public class SimpleSubject implements Subject{
    private List<Observer> observers;
    private int value = 0;

    
    public SimpleSubject() {
        observers = new ArrayList<Observer>();
    }
    public void registerObsever(Observer observer) {
        observers.add(observer);
    }
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(value);
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        notifyObserver();
    }
}
