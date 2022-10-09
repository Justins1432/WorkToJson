package repository;

import com.google.gson.Gson;
import model.ForecastWeatherJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class RepositoryWeather {
    private ForecastWeatherJava forecastWeather;

    public RepositoryWeather(String urlString) throws IOException {
        URL url = new URL(urlString);
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()))){
            Gson gson = new Gson();
            forecastWeather = gson.fromJson(reader, ForecastWeatherJava.class);
        }
    }

    @Override
    public String toString() {
        return "RepositoryWeather{" +
                "forecastWeather=" + forecastWeather +
                '}';
    }
}
