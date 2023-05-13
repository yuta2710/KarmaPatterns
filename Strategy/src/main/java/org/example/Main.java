package org.example;

import org.example.Entity.WeatherForecast;
import org.example.Strategy.DailyWeatherForecastingStrategy;
import org.example.Strategy.HourlyWeatherForecastingStrategy;
import org.example.Strategy.WeeklyWeatherForecastingStrategy;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> temperatures = Arrays.asList(10.5, 12.0, 13.5, 15.0, 16.5, 18.0, 20.5, 22.0, 23.5, 24.0, 22.5, 20.0, 18.5, 17.0, 16.5, 15.0, 14.5, 13.0, 12.5, 11.5, 10.0, 9.5, 9.0, 8.5);

        WeatherForecast weatherForecast = new WeatherForecast(new HourlyWeatherForecastingStrategy());
        double averageTemperature = weatherForecast.getAverageTemperature(temperatures);
        System.out.println("Average temperature over the past hour: " + averageTemperature);

        // If want to modify, just set strategy to modify the behavior of that interface such as DailyWeatherForecastingStrategy
        weatherForecast.setStrategy(new DailyWeatherForecastingStrategy());
        averageTemperature = weatherForecast.getAverageTemperature(temperatures);
        System.out.println("Average temperature over the past day: " + averageTemperature);

        weatherForecast.setStrategy(new WeeklyWeatherForecastingStrategy());
        averageTemperature = weatherForecast.getAverageTemperature(temperatures);
        System.out.println("Average temperature over the past week: " + averageTemperature);
    }

}