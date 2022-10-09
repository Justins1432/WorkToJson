package repository

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import model.ForecastWeather
import model.ListWeather
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

class WeatherRepository {
    private lateinit var forecastWeather: ForecastWeather

    fun getForecastWeather(url: String): ForecastWeather {
        val url = URL(url)
        val httpURLConnection = url.openConnection() as HttpURLConnection
        try {
            val gson = Gson()
            val bufferedReader = BufferedReader(InputStreamReader(httpURLConnection.inputStream))
            forecastWeather = gson.fromJson(bufferedReader, ForecastWeather::class.java)
        } catch (exception: IOException) {
            println(exception.message ?: "Error download data")
        }
        return forecastWeather
    }

    override fun toString(): String {
        return "WeatherRepository(forecastWeather=$forecastWeather)"
    }

}