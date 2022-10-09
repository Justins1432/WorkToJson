package model

import com.google.gson.annotations.SerializedName
import java.text.SimpleDateFormat
import java.util.*

interface DateParse{
    fun dateParse(dt_txt: String): String
}

private class DateParseOperation {
    fun dateParse(dtTxt: String): String {
        var simpleDateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        val date: Date = simpleDateFormat.parse(dtTxt)
        simpleDateFormat = SimpleDateFormat("dd-MM-yyyy")
        val formatDate: String = simpleDateFormat.format(date)
        return formatDate

    }
}

data class ForecastWeather(
    val city: City,
    val cnt: Int,
    val cod: String,
    val list: List<ListWeather>,
    val message: Int
)

data class ListWeather(
    val clouds: Clouds,
    val dt: Int,
    val dt_txt: String,
    val main: Main,
    val pop: Double,
    val rain: Rain,
    val sys: Sys,
    val visibility: Int,
    val weather: List<Weather>,
    val wind: Wind
):DateParse {
    override fun dateParse(dt_txt: String): String {
        val dateParseOperation = DateParseOperation()
        return dateParseOperation.dateParse(dtTxt = this.dt_txt)
    }

    override fun toString(): String {
        return "ListWeather(dt_txt='${dateParse(dt_txt)}', main=$main)"
    }
}

data class Main(
    val feels_like: Double,
    val grnd_level: Int,
    val humidity: Int,
    val pressure: Int,
    val sea_level: Int,
    val temp: Double,
    val temp_kf: Double,
    val temp_max: Double,
    val temp_min: Double
)

data class Weather(
    val description: String,
    val icon: String,
    val id: Int,
    val main: String
)

data class Clouds(
    val all: Int
)

data class Rain(
    @SerializedName("3h") val h_3: Double
)

data class Wind(
    val deg: Int,
    val gust: Double,
    val speed: Double
)

data class Sys(
    val pod: String
)

data class City(
    val coord: Coord,
    val country: String,
    val id: Int,
    val name: String,
    val population: Int,
    val sunrise: Int,
    val sunset: Int,
    val timezone: Int
)

data class Coord(
    val lat: Double,
    val lon: Double
)