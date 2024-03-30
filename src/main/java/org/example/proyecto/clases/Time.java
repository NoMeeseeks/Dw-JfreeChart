package org.example.proyecto.clases;

public class Time {
    private int timeId;
    private String year;
    private String quarter;
    private String month;
    private String hour;
    private String minute;
    private String second;

    public Time(int timeId, String year, String quarter, String month, String hour, String minute, String second) {
        this.timeId = timeId;
        this.year = year;
        this.quarter = quarter;
        this.month = month;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getTimeId() {
        return timeId;
    }

    public void setTimeId(int timeId) {
        this.timeId = timeId;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getQuarter() {
        return quarter;
    }

    public void setQuarter(String quarter) {
        this.quarter = quarter;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getMinute() {
        return minute;
    }

    public void setMinute(String minute) {
        this.minute = minute;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

}
