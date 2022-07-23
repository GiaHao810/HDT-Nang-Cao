package Buoi5.ObserverPattern.WeatherApps.SO2_WithObservable;

import Buoi5.ObserverPattern.WeatherApps.SO2_WithObservable.Displays.currentConditions_Display;
import Buoi5.ObserverPattern.WeatherApps.SO2_WithObservable.Displays.forecastDisplay;
import Buoi5.ObserverPattern.WeatherApps.SO2_WithObservable.Displays.statisticDisplay;

public class WeatherStation {
    public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
	
		currentConditions_Display currentDisplay = new currentConditions_Display(weatherData);
		statisticDisplay statisticsDisplay = new statisticDisplay(weatherData);
		forecastDisplay forecastDisplay = new forecastDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println("");
		weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println("");
		weatherData.setMeasurements(78, 90, 29.2f);
        System.out.println("");

		weatherData.removeObserver(forecastDisplay);
        weatherData.setMeasurements(62, 90, 28.1f);
	}
}
