package model;

import java.util.List;
import java.util.Objects;

/**
 * data class ForecastWeather(
 *     val city: City,
 *     val cnt: Int,
 *     val cod: String,
 *     val list: List<ListWeather>,
 *     val message: Int
 * )
 */

public class ForecastWeatherJava {
    private CityJava city;
    private int cnt;
    private String cod;
    private List<ListWeatherJava> list;
    private int message;

    public ForecastWeatherJava(CityJava city, int cnt, String cod, List<ListWeatherJava> list, int message) {
        this.city = city;
        this.cnt = cnt;
        this.cod = cod;
        this.list = list;
        this.message = message;
    }

    public CityJava getCity() {
        return city;
    }

    public void setCity(CityJava city) {
        this.city = city;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public List<ListWeatherJava> getList() {
        return list;
    }

    public void setList(List<ListWeatherJava> list) {
        this.list = list;
    }

    public int getMessage() {
        return message;
    }

    public void setMessage(int message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForecastWeatherJava that = (ForecastWeatherJava) o;
        return cnt == that.cnt && message == that.message && city.equals(that.city) && cod.equals(that.cod) && list.equals(that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, cnt, cod, list, message);
    }

    @Override
    public String toString() {
        return "ForecastWeatherJava{" +
                "city=" + city +
                ", cnt=" + cnt +
                ", cod='" + cod + '\'' +
                ", list=" + list +
                ", message=" + message +
                '}';
    }
}
