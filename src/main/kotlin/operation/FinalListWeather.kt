package operation

import model.ListWeather

class FinalListWeather {

    fun finalList(list: List<ListWeather>): List<List<ListWeather>> {
        val listListWeather: MutableList<List<ListWeather>> = mutableListOf()
        var bufferList: MutableList<ListWeather> = mutableListOf()

        if (list.size > 1) {
            list.forEachIndexed { index, listWeather ->
                when (index != list.size - 1) {
                    true -> {
                        if (listWeather.dt_txt == list[index + 1].dt_txt) {
                            bufferList.add(listWeather)
                        } else if (index != 0 && listWeather.dt_txt == list[index - 1].dt_txt) {
                            bufferList.add(listWeather)
                            listListWeather.add(bufferList)
                            bufferList = mutableListOf()
                        } else {
                            listListWeather.add(bufferList)
                            bufferList = mutableListOf()
                        }
                    }
                    false -> {
                        if (listWeather.dt_txt == list[index - 1].dt_txt) {
                            bufferList.add(listWeather)
                            listListWeather.add(bufferList)
                        } else {
                            bufferList = mutableListOf()
                            bufferList.add(listWeather)
                            listListWeather.add(bufferList)
                        }
                    }
                }
            }
        } else {
            //listListWeather.add(list)
        }
        return listListWeather.toList()
    }

}