package Buoi5.ObserverPattern.WeatherApps.Solution2;

import java.util.ArrayList;
import java.util.List;

public class WeatherData  implements Subject{
    private List<Observer> observers;
    private float temp;
    private float humidity;
    private float pressure;
   
    public WeatherData() {
        observers = new ArrayList<Observer>();
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
       for (Observer observer : observers) {
            observer.update(temp, humidity, pressure);
       }
    }

    public void measurementsChanged(){
       //notifyObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temp = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
    
    public float getTemperature(){
        return temp;
    }

    public float getHumidity(){
        return humidity;
    }

    public float getPressure(){
        return pressure;
    }
}
