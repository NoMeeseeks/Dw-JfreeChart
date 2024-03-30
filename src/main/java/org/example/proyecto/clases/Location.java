package org.example.proyecto.clases;

import java.time.LocalDate;

public class Location {
    private int locationId;
    private String name;
    private int costRate;
    private String availability;
    private LocalDate modifiedDate;

    public Location(int locationId, String name, int costRate, String availability, LocalDate modifiedDate) {
        this.locationId = locationId;
        this.name = name;
        this.costRate = costRate;
        this.availability = availability;
        this.modifiedDate = modifiedDate;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCostRate() {
        return costRate;
    }

    public void setCostRate(int costRate) {
        this.costRate = costRate;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public LocalDate getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(LocalDate modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

}
