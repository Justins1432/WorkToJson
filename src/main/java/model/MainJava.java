package model;

import java.util.Objects;

/**
 *     data class Main(
 *     val feels_like: Double,
 *     val grnd_level: Int,
 *     val humidity: Int,
 *     val pressure: Int,
 *     val sea_level: Int,
 *     val temp: Double,
 *     val temp_kf: Double,
 *     val temp_max: Double,
 *     val temp_min: Double
 * )
 */

public class MainJava {
    private double feels_like;
    private int grnd_level;
    private int humidity;
    private int pressure;
    private int sea_level;
    private double temp;
    private double temp_kf;
    private double temp_max;
    private double temp_min;

    public MainJava(double feels_like, int grnd_level, int humidity, int pressure, int sea_level, double temp, double temp_kf, double temp_max, double temp_min) {
        this.feels_like = feels_like;
        this.grnd_level = grnd_level;
        this.humidity = humidity;
        this.pressure = pressure;
        this.sea_level = sea_level;
        this.temp = temp;
        this.temp_kf = temp_kf;
        this.temp_max = temp_max;
        this.temp_min = temp_min;
    }

    public double getFeels_like() {
        return feels_like;
    }

    public void setFeels_like(double feels_like) {
        this.feels_like = feels_like;
    }

    public int getGrnd_level() {
        return grnd_level;
    }

    public void setGrnd_level(int grnd_level) {
        this.grnd_level = grnd_level;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getSea_level() {
        return sea_level;
    }

    public void setSea_level(int sea_level) {
        this.sea_level = sea_level;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getTemp_kf() {
        return temp_kf;
    }

    public void setTemp_kf(double temp_kf) {
        this.temp_kf = temp_kf;
    }

    public double getTemp_max() {
        return temp_max;
    }

    public void setTemp_max(double temp_max) {
        this.temp_max = temp_max;
    }

    public double getTemp_min() {
        return temp_min;
    }

    public void setTemp_min(double temp_min) {
        this.temp_min = temp_min;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MainJava mainJava = (MainJava) o;
        return Double.compare(mainJava.feels_like, feels_like) == 0
                && grnd_level == mainJava.grnd_level && humidity == mainJava.humidity
                && pressure == mainJava.pressure && sea_level == mainJava.sea_level
                && Double.compare(mainJava.temp, temp) == 0
                && Double.compare(mainJava.temp_kf, temp_kf) == 0
                && Double.compare(mainJava.temp_max, temp_max) == 0
                && Double.compare(mainJava.temp_min, temp_min) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(feels_like, grnd_level, humidity, pressure, sea_level, temp, temp_kf, temp_max, temp_min);
    }

    @Override
    public String toString() {
        return "MainJava{" +
                "feels_like=" + feels_like +
                ", grnd_level=" + grnd_level +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                ", sea_level=" + sea_level +
                ", temp=" + temp +
                ", temp_kf=" + temp_kf +
                ", temp_max=" + temp_max +
                ", temp_min=" + temp_min +
                '}';
    }
}
