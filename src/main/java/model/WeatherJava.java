package model;

import java.util.Objects;

/**
 * data class Weather(
 *     val description: String,
 *     val icon: String,
 *     val id: Int,
 *     val main: String
 * )
 */
public class WeatherJava {
    private String description;
    private String icon;
    private int id;
    private String main;

    public WeatherJava(String description, String icon, int id, String main) {
        this.description = description;
        this.icon = icon;
        this.id = id;
        this.main = main;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WeatherJava that = (WeatherJava) o;
        return id == that.id && description.equals(that.description) && icon.equals(that.icon) && main.equals(that.main);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, icon, id, main);
    }

    @Override
    public String toString() {
        return "WeatherJava{" +
                "description='" + description + '\'' +
                ", icon='" + icon + '\'' +
                ", id=" + id +
                ", main='" + main + '\'' +
                '}';
    }
}
