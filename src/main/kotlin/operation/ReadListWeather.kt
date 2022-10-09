package operation

import ReadyModelWeather
import model.ListWeather

class ReadListWeather {
    fun readyList(listValue: List<List<ListWeather>>): List<ReadyModelWeather> {
        val readyList = mutableListOf<ReadyModelWeather>()
        listValue.forEachIndexed { index, modelWeathers ->
            val data = modelWeathers[0].dt_txt_parse
            var maxValue = modelWeathers[0].main.temp_max
            var minValue = modelWeathers[0].main.temp_min
            var iterable = 1

            modelWeathers.forEachIndexed { index, currentModelWeather ->
                if (index != 0) {
                    iterable++
                    maxValue += currentModelWeather.main.temp_max
                    minValue += currentModelWeather.main.temp_min
                }
            }
            readyList.add(ReadyModelWeather(data, maxValue / iterable, minValue / iterable))
        }

        return readyList

    }
}