package repository

import com.google.gson.Gson
import model.ForecastWeather
import model.ListWeather
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

class WeatherListRepository {
    private lateinit var listWeather: List<ListWeather>

    fun getListWeather(urlString: String): List<ListWeather> {
        val url = URL(urlString)
        val httpURLConnection = url.openConnection() as HttpURLConnection

        try {
            val gson = Gson()
            val bufferedReader = BufferedReader(InputStreamReader(httpURLConnection.inputStream))
            val forecastWeather: ForecastWeather = gson.fromJson(bufferedReader, ForecastWeather::class.java)
            listWeather = forecastWeather.list
        } catch (exception: IOException) {
            exception.message
        }

        return listWeather
    }


    override fun toString(): String {
        return "WeatherListRepository(listWeather=$listWeather)"
    }


}