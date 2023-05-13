package org.example.Strategy;

import java.util.List;

public class WeeklyWeatherForecastingStrategy implements WeatherForecastingStrategy {
    private final double WEEK_DATUM = 5.0;

    public WeeklyWeatherForecastingStrategy() {}

    @Override
    public double calculateAverageTemperature(List<Double> temperatures) {
        // Assuming that the input list contains 168 temperatures, one for each hour of the week
        double sum = 0.0;
        for (double temp : temperatures) {
            sum += temp;
        }
        return sum / temperatures.size();
    }
}