package com.kuznietsov.design.patterns.behavioral.observer;

public class ObserverPatternDemo {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentTemperatureDisplay currentTemperatureDisplay = new CurrentTemperatureDisplay(weatherData);
        weatherData.setTemperature(12.0);
        weatherData.setTemperature(-11.5);
        weatherData.setTemperature(2.0);
    }
}
