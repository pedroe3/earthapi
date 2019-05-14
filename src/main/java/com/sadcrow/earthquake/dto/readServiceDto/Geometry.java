package com.sadcrow.earthquake.dto.readServiceDto;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Geometry {

    @JsonProperty("type")
    private String type;

    @JsonProperty("coordinates")
    private double[] coordinates;

    public Geometry() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double[] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(double[] coordinates) {
        this.coordinates = coordinates;
    }
}
