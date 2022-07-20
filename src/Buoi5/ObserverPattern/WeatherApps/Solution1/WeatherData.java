package Buoi5.ObserverPattern.WeatherApps.Solution1;

public class WeatherData {
    private float temp;
    private float humidity;
    private float pressure;

    public float getTemperature(){
        return temp;
    }

    public float getHumidity(){
        return humidity;
    }

    public float getPressure(){
        return pressure;
    }

    public void measurementsChanged(){
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        // currentConditionsDisplay.update(temp, humidity, pressure);
        // statisticsDisplay.update(temp, humidity, pressure);
        // forecastDisplay.update(temp, humidity, pressure);
    }
}
