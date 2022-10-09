package model;

import java.util.List;
import java.util.Objects;


/**
 * val clouds: Clouds,
 *     val dt: Int,
 *     val dt_txt: String,
 *     val main: Main,
 *     val pop: Double,
 *     val rain: Rain,
 *     val sys: Sys,
 *     val visibility: Int,
 *     val weather: List<Weather>,
 *     val wind: Wind
 */
public class ListWeatherJava {
    private int dt;
    private String dt_txt;
    private MainJava main;
    private double pop;
    private RainJava rain;
    private SysJava sys;
    private int visibility;
    private List<WeatherJava> weather;
    private WindJava wind;

    public ListWeatherJava(int dt, String dt_txt, MainJava main, double pop, RainJava rain, SysJava sys, int visibility, List<WeatherJava> weather, WindJava wind) {
        this.dt = dt;
        this.dt_txt = dt_txt;
        this.main = main;
        this.pop = pop;
        this.rain = rain;
        this.sys = sys;
        this.visibility = visibility;
        this.weather = weather;
        this.wind = wind;
    }

    public int getDt() {
        return dt;
    }

    public void setDt(int dt) {
        this.dt = dt;
    }

    public String getDt_txt() {
        return dt_txt;
    }

    public void setDt_txt(String dt_txt) {
        this.dt_txt = dt_txt;
    }

    public MainJava getMain() {
        return main;
    }

    public void setMain(MainJava main) {
        this.main = main;
    }

    public double getPop() {
        return pop;
    }

    public void setPop(double pop) {
        this.pop = pop;
    }

    public RainJava getRain() {
        return rain;
    }

    public void setRain(RainJava rain) {
        this.rain = rain;
    }

    public SysJava getSys() {
        return sys;
    }

    public void setSys(SysJava sys) {
        this.sys = sys;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public List<WeatherJava> getWeather() {
        return weather;
    }

    public void setWeather(List<WeatherJava> weather) {
        this.weather = weather;
    }

    public WindJava getWind() {
        return wind;
    }

    public void setWind(WindJava wind) {
        this.wind = wind;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListWeatherJava that = (ListWeatherJava) o;
        return dt == that.dt && Double.compare(that.pop, pop) == 0
                && visibility == that.visibility && dt_txt.equals(that.dt_txt)
                && main.equals(that.main) && rain.equals(that.rain)
                && sys.equals(that.sys) && weather.equals(that.weather) && wind.equals(that.wind);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dt, dt_txt, main, pop, rain, sys, visibility, weather, wind);
    }

    @Override
    public String toString() {
        return "ListWeatherJava{" +
                "dt=" + dt +
                ", dt_txt='" + dt_txt + '\'' +
                ", main=" + main +
                ", pop=" + pop +
                ", rain=" + rain +
                ", sys=" + sys +
                ", visibility=" + visibility +
                ", weather=" + weather +
                ", wind=" + wind +
                '}';
    }
}
