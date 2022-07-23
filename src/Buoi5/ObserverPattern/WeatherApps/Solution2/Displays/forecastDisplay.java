package Buoi5.ObserverPattern.WeatherApps.Solution2.Displays;

import Buoi5.ObserverPattern.WeatherApps.Solution2.Observer;
import Buoi5.ObserverPattern.WeatherApps.Solution2.WeatherData;

public class forecastDisplay implements Observer, DisplayElement, Buoi5.ObserverPattern.WeatherApps.SO2_WithObservable.Observer {
    private float currentPressure = 29.92f;  
	private float lastPressure;
	private WeatherData weatherData;
	
	public forecastDisplay(WeatherData weatherData2) {
		this.weatherData = weatherData2;
		weatherData2.registerObserver(this);
	}

	public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
		currentPressure = pressure;

		display();
	}

	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}
}
