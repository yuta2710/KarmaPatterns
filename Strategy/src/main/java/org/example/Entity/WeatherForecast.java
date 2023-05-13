package org.example.Entity;

import org.example.Strategy.WeatherForecastingStrategy;

import java.util.List;

public class WeatherForecast {
    private WeatherForecastingStrategy strategy;

    public WeatherForecast(WeatherForecastingStrategy strategy) {
        this.strategy = strategy;
    }

    public WeatherForecastingStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(WeatherForecastingStrategy strategy) {
        this.strategy = strategy;
    }

    public double getAverageTemperature(List<Double> temperatures){
        return strategy.calculateAverageTemperature(temperatures);
    }
}
