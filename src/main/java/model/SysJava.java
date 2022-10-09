package model;

import java.util.Objects;

/**
 * data class Sys(
 *     val pod: String
 * )
 */
public class SysJava {
    private String pod;

    public SysJava(String pod) {
        this.pod = pod;
    }

    public String getPod() {
        return pod;
    }

    public void setPod(String pod) {
        this.pod = pod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysJava sysJava = (SysJava) o;
        return pod.equals(sysJava.pod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pod);
    }

    @Override
    public String toString() {
        return "SysJava{" +
                "pod='" + pod + '\'' +
                '}';
    }
}
