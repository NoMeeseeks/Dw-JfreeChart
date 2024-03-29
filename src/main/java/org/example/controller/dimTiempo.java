package org.example.controller;

import java.sql.Date;

public class dimTiempo {
    private int tiempoID;
    private Date date;
    private int weekNumber;
    private int month;
    private int year;
    public dimTiempo(){

    }

    public int getTiempoID() {
        return tiempoID;
    }

    public void setTiempoID(int tiempoID) {
        this.tiempoID = tiempoID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getWeekNumber() {
        return weekNumber;
    }

    public void setWeekNumber(int weekNumber) {
        this.weekNumber = weekNumber;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
