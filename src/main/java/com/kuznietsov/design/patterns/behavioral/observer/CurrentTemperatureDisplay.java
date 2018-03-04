package com.kuznietsov.design.patterns.behavioral.observer;

public class CurrentTemperatureDisplay implements Observer {
    private Double temperature;
    private WeatherData weatherData;


    public CurrentTemperatureDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    private void display() {
        System.out.println(String.format("Current temperature is: %s", temperature));
    }

    @Override
    public void update(Double temperature) {
        this.temperature = temperature;
        display();
    }
}
