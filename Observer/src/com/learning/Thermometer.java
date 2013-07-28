package com.learning;

public class Thermometer implements Observer, DisplayElement {

	float temp;
	private Subject weatherData;
		
	
	public Thermometer(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		
		this.temp = temp;
		display();
	}
	
	@Override
	public void display() {
		System.out.println("Current temp is: " + temp + " F degrees");
		
	}
	
}
