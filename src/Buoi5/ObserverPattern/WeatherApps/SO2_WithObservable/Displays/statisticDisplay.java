package Buoi5.ObserverPattern.WeatherApps.SO2_WithObservable.Displays;

import java.util.Observable;

import Buoi5.ObserverPattern.WeatherApps.SO2_WithObservable.Observer;
import Buoi5.ObserverPattern.WeatherApps.SO2_WithObservable.WeatherData;

public class statisticDisplay extends Observable implements Observer{
    private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int numReadings;
	private WeatherData weatherData;

	public statisticDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temp, float humidity, float pressure) {
		tempSum += temp;
		numReadings++;

		if (temp > maxTemp) {
			maxTemp = temp;
		}
 
		if (temp < minTemp) {
			minTemp = temp;
		}

		display();
	}

	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
			+ "/" + maxTemp + "/" + minTemp);
	}
}
