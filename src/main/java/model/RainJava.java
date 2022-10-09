package model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

/**
 * data class Rain(
 *     @SerializedName("3h") val h_3: Double
 * )
 */
public class RainJava implements Serializable {
    @SerializedName("3h")
    private double h_3;

    public RainJava(double h_3) {
        this.h_3 = h_3;
    }

    public double getH_3() {
        return h_3;
    }

    public void setH_3(double h_3) {
        this.h_3 = h_3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RainJava rainJava = (RainJava) o;
        return Double.compare(rainJava.h_3, h_3) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(h_3);
    }

    @Override
    public String toString() {
        return "RainJava{" +
                "h_3=" + h_3 +
                '}';
    }
}
