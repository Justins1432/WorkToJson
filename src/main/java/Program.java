
import repository.WeatherListRepository;
import repository.RepositoryWeather;

import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {

        RepositoryWeather repositoryWeather = new RepositoryWeather(
                "https://api.openweathermap.org/data/2.5/forecast?q=Samara,RU&appid=a552b39b529b0402a3b40d2affee9ef4&units=metric&lang=ru&cnt=40");
        System.out.println(repositoryWeather + "\n");



    }
}
