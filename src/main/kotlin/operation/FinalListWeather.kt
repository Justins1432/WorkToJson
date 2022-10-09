package operation

import model.ListWeather

class FinalListWeather {

    fun finalList(list: List<ListWeather>): List<List<ListWeather>> {
        val listListWeather: MutableList<List<ListWeather>> = mutableListOf()
        var bufferList: MutableList<ListWeather> = mutableListOf()

        if (list.size > 1) {
            list.forEachIndexed { index, weather ->
                when (index != list.size - 1) {
                    true -> {
                        if (weather.dt_txt_parse == list[index + 1].dt_txt_parse) {
                            bufferList.add(weather)
                        } else if (index != 0 && weather.dt_txt_parse == list[index - 1].dt_txt_parse) {
                            bufferList.add(weather)
                            listListWeather.add(bufferList)
                            bufferList = mutableListOf()
                        } else {
                            bufferList.add(weather)
                            listListWeather.add(bufferList)
                            bufferList = mutableListOf()
                        }
                    }
                    false -> {
                        if (weather.dt_txt_parse == list[index - 1].dt_txt_parse) {
                            bufferList.add(weather)
                            listListWeather.add(bufferList)
                        } else {
                            bufferList = mutableListOf()
                            bufferList.add(weather)
                            listListWeather.add(bufferList)
                        }
                    }
                }
            }
        } else {
            listListWeather.add(list)
        }
        return listListWeather.toList()
    }

}