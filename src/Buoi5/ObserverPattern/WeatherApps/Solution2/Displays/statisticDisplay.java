package Buoi5.ObserverPattern.WeatherApps.Solution2.Displays;

import Buoi5.ObserverPattern.WeatherApps.Solution2.Observer;
import Buoi5.ObserverPattern.WeatherApps.Solution2.WeatherData;

public class statisticDisplay implements Observer{
    private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int numReadings;
	private WeatherData weatherData;

	public statisticDisplay(WeatherData weatherData2) {
		this.weatherData = weatherData2;
		weatherData2.registerObserver(this);
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
