package model;

import java.util.Objects;

/**
 *     data class Wind(
 *     val deg: Int,
 *     val gust: Double,
 *     val speed: Double
 * )
 */

public class WindJava {
    private int deg;
    private double gust;
    private double speed;

    public WindJava(int deg, double gust, double speed) {
        this.deg = deg;
        this.gust = gust;
        this.speed = speed;
    }

    public int getDeg() {
        return deg;
    }

    public void setDeg(int deg) {
        this.deg = deg;
    }

    public double getGust() {
        return gust;
    }

    public void setGust(double gust) {
        this.gust = gust;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WindJava windJava = (WindJava) o;
        return deg == windJava.deg && Double.compare(windJava.gust, gust) == 0 && Double.compare(windJava.speed, speed) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(deg, gust, speed);
    }

    @Override
    public String toString() {
        return "WindJava{" +
                "deg=" + deg +
                ", gust=" + gust +
                ", speed=" + speed +
                '}';
    }
}
