package model;

import java.util.Objects;

/**
 * data class Clouds(
 *     val all: Int
 * )
 */
public class CloudsJava {
    private int all;

    public CloudsJava(int all) {
        this.all = all;
    }

    public int getAll() {
        return all;
    }

    public void setAll(int all) {
        this.all = all;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CloudsJava that = (CloudsJava) o;
        return all == that.all;
    }

    @Override
    public int hashCode() {
        return Objects.hash(all);
    }

    @Override
    public String toString() {
        return "CloudsJava{" +
                "all=" + all +
                '}';
    }
}
