import model.ForecastWeather
import model.ListWeather
import operation.FinalListWeather
import operation.ReadListWeather
import repository.WeatherListRepository
import repository.WeatherRepository

fun main(args: Array<String>) {
    val repository = WeatherRepository()

    val forecastWeather: ForecastWeather =
        repository.getForecastWeather(
            "https://api.openweathermap.org/data/2.5/forecast?q=Samara,RU&appid=a552b39b529b0402a3b40d2affee9ef4&units=metric&lang=ru&cnt=40"
        )
    println(forecastWeather)

    println()

    val weatherListRepository = WeatherListRepository()
    val list: List<ListWeather> = weatherListRepository.getListWeather(
        "https://api.openweathermap.org/data/2.5/forecast?q=Samara,RU&appid=a552b39b529b0402a3b40d2affee9ef4&units=metric&lang=ru&cnt=40"
    )

    println(list)

    println("final list")

    val finalList = FinalListWeather().finalList(list)

    finalList.forEach {
        println("finalList элемент массива")
        it.forEach {
            println("\t $it")
        }
    }

    val readyListWeather = ReadListWeather().readyList(finalList)
    println("\nreadyList")
    readyListWeather.forEach {
        println(it)
    }


}

