package Buoi5.ObserverPattern.WeatherApps.SO2_WithObservable;

public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver();
}
