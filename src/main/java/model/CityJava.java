package model;

import java.util.Objects;

/**
 * data class City(
 *     val coord: Coord,
 *     val country: String,
 *     val id: Int,
 *     val name: String,
 *     val population: Int,
 *     val sunrise: Int,
 *     val sunset: Int,
 *     val timezone: Int
 * )
 */
public class CityJava {
    private CoordJava coord;
    private String country;
    private int id;
    private String name;
    private int population;
    private int sunrise;
    private int sunset;
    private int timezone;

    public CityJava(CoordJava coord, String country, int id, String name, int population, int sunrise, int sunset, int timezone) {
        this.coord = coord;
        this.country = country;
        this.id = id;
        this.name = name;
        this.population = population;
        this.sunrise = sunrise;
        this.sunset = sunset;
        this.timezone = timezone;
    }

    public CoordJava getCoord() {
        return coord;
    }

    public void setCoord(CoordJava coord) {
        this.coord = coord;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getSunrise() {
        return sunrise;
    }

    public void setSunrise(int sunrise) {
        this.sunrise = sunrise;
    }

    public int getSunset() {
        return sunset;
    }

    public void setSunset(int sunset) {
        this.sunset = sunset;
    }

    public int getTimezone() {
        return timezone;
    }

    public void setTimezone(int timezone) {
        this.timezone = timezone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CityJava cityJava = (CityJava) o;
        return id == cityJava.id && population == cityJava.population
                && sunrise == cityJava.sunrise
                && sunset == cityJava.sunset
                && timezone == cityJava.timezone
                && coord.equals(cityJava.coord)
                && country.equals(cityJava.country)
                && name.equals(cityJava.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coord, country, id, name, population, sunrise, sunset, timezone);
    }

    @Override
    public String toString() {
        return "CityJava{" +
                "coord=" + coord +
                ", country='" + country + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", population=" + population +
                ", sunrise=" + sunrise +
                ", sunset=" + sunset +
                ", timezone=" + timezone +
                '}';
    }
}
