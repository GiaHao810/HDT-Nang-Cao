package Buoi5.ObserverPattern.WeatherApps.Subject_Observer;

public interface Subject {
    public void registerObsever(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver();
}
