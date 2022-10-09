package model;

import java.util.Objects;

/**
 * data class Coord(
 *     val lat: Double,
 *     val lon: Double
 * )
 */
public class CoordJava {
    private double lat;
    private double lon;

    public CoordJava(double lat, double lon) {
        this.lat = lat;
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoordJava coordJava = (CoordJava) o;
        return Double.compare(coordJava.lat, lat) == 0 && Double.compare(coordJava.lon, lon) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lat, lon);
    }

    @Override
    public String toString() {
        return "CoordJava{" +
                "lat=" + lat +
                ", lon=" + lon +
                '}';
    }
}
