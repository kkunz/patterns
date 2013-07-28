package com.learning;

public class WeatherStation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		Thermometer thermometer = new Thermometer(weatherData);
		
		weatherData.setMeasurement(75, 86, 30.7f);

	}

}
