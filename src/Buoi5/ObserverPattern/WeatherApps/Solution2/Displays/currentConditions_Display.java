package Buoi5.ObserverPattern.WeatherApps.Solution2.Displays;

import Buoi5.ObserverPattern.WeatherApps.Solution2.Observer;
import Buoi5.ObserverPattern.WeatherApps.Solution2.WeatherData;

public class currentConditions_Display implements Observer, DisplayElement{
    private float temperature;
	private float humidity;
	private WeatherData weatherData;
	
	public currentConditions_Display(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
	
	public void display() {
		System.out.println("Current conditions: " + temperature 
			+ "F degrees and " + humidity + "% humidity");
	}
}
