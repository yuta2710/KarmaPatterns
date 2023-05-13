package org.example.Strategy;

import java.util.List;

public interface WeatherForecastingStrategy {
    public double calculateAverageTemperature(List<Double> temperatures);
}
