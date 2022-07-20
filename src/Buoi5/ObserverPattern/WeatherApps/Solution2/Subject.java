package Buoi5.ObserverPattern.WeatherApps.Solution2;

public interface Subject {
    public void registerObsever();
    public void removeObserver();
    public void notifyObserver();
}
