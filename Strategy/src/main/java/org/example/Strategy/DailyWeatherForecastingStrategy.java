package org.example.Strategy;

import java.util.List;

public class DailyWeatherForecastingStrategy implements WeatherForecastingStrategy{
    private final double DAILY_DATUM = 15.2;

    public DailyWeatherForecastingStrategy() {}

    @Override
    public double calculateAverageTemperature(List<Double> temperatures) {
        double sum = 0.0;

        for(Double temp : temperatures){
            sum += temp;
        }

        return sum + DAILY_DATUM;
    }
}
