package Buoi5.ObserverPattern.WeatherApps.SO2_WithObservable.Displays;

import Buoi5.ObserverPattern.WeatherApps.SO2_WithObservable.Observer;
import Buoi5.ObserverPattern.WeatherApps.SO2_WithObservable.WeatherData;

public class forecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;  
	private float lastPressure;
	private WeatherData weatherData;
	
	public forecastDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
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
