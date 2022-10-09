package repository;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import model.ForecastWeatherJava;
import model.ListWeather;
import model.ListWeatherJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

public class ListWeatherRepository {
    private List<ListWeatherJava> listWeatherJavaList;

    public ListWeatherRepository(String urlString) throws IOException {
        URL url = new URL(urlString);
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()))) {
            Gson gson = new Gson();
            ForecastWeatherJava forecastWeatherJava = gson.fromJson(reader, ForecastWeatherJava.class);
            listWeatherJavaList = forecastWeatherJava.getList();
        }
    }

    @Override
    public String toString() {
        return "ListWeatherRepository{" +
                "listWeatherJavaList=" + listWeatherJavaList +
                '}';
    }
}
