package org.example.Strategy;

import java.util.List;

public class HourlyWeatherForecastingStrategy implements WeatherForecastingStrategy{
    private final double HOUR_DATUM = 25.5;

    public HourlyWeatherForecastingStrategy() {}

    @Override
    public double calculateAverageTemperature(List<Double> temperatures) {
        double sum = 0.0;

        for(Double temp : temperatures){
            sum += temp;
        }

        return sum + HOUR_DATUM;
    }
}
