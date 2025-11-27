package ua.opnu;

import java.util.Objects;


public class TimeSpan {

    private int totalMinutes;

    public TimeSpan() {
        this.totalMinutes = 0;
    }

    public TimeSpan(int minutes) {
        this.totalMinutes = minutes;
    }

    public TimeSpan(int hours, int minutes) {
        this.totalMinutes = hours * 60 + minutes;
    }

    public TimeSpan(TimeSpan other) {
        this.totalMinutes = (other == null) ? 0 : other.totalMinutes;
    }


    public int getHours() {
        int abs = Math.abs(totalMinutes);
        int h = abs / 60;
        return totalMinutes < 0 ? -h : h;
    }

    public int getMinutes() {
        int abs = Math.abs(totalMinutes);
        return abs % 60;
    }
  
    public int toTotalMinutes() {
        return totalMinutes;
    }

    public double toTotalHours() {
        return totalMinutes / 60.0;
    }

    @Deprecated
    public int getTotalMinutes() {
        return toTotalMinutes();
    }

    @Deprecated
    public double getTotalHours() {
        return toTotalHours();
    }

    @Deprecated
    public void addTimeSpan(TimeSpan timespan) {
        add(timespan);
    }

    public TimeSpan add(int hours, int minutes) {
        this.totalMinutes += hours * 60 + minutes;
        return this;
    }

    public TimeSpan add(int minutes) {
        this.totalMinutes += minutes;
        return this;
    }

    public TimeSpan add(TimeSpan other) {
        if (other != null) {
            this.totalMinutes += other.totalMinutes;
        }
        return this;
    }

    public TimeSpan subtract(int hours, int minutes) {
        return add(-hours, -minutes);
    }

    public TimeSpan subtract(int minutes) {
        return add(-minutes);
    }

    public TimeSpan subtract(TimeSpan other) {
        return add(other == null ? 0 : -other.totalMinutes);
    }

    public void scale(int factor) {
        if (factor > 0) {
            this.totalMinutes *= factor;
        }
    }

    @Override
    public String toString() {
        int abs = Math.abs(totalMinutes);
        int h = abs / 60;
        int m = abs % 60;
        String sign = totalMinutes < 0 ? "-" : "";
        return sign + h + ":" + String.format("%02d", m);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TimeSpan)) return false;
        TimeSpan timeSpan = (TimeSpan) o;
        return totalMinutes == timeSpan.totalMinutes;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(totalMinutes);
    }
}
