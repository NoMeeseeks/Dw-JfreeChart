package org.example.proyecto.clases;

public class Time {
    private int timeId;
    private int quarter;
    private int month;
    private int hour;
    private int year;
    private int minute;
    private int second;

    public Time(int timeId, int quarter, int month, int hour, int year, int minute, int second) {
        this.timeId = timeId;
        this.quarter = quarter;
        this.month = month;
        this.hour = hour;
        this.year = year;
        this.minute = minute;
        this.second = second;
    }

    public int getTimeId() {
        return timeId;
    }

    public void setTimeId(int timeId) {
        this.timeId = timeId;
    }

    public int getQuarter() {
        return quarter;
    }

    public void setQuarter(int quarter) {
        this.quarter = quarter;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

}
