package com.sadcrow.earthquake.dto.readServiceDto;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Feature {

    @JsonProperty("type")
    private String type;

    @JsonProperty("properties")
    private Properties properties;

    @JsonProperty("geometry")
    private Geometry geometry;

    @JsonProperty("id")
    private String id;

    public Feature() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}