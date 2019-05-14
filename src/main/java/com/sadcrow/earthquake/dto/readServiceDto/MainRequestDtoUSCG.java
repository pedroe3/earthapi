package com.sadcrow.earthquake.dto.readServiceDto;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class MainRequestDtoUSCG {

    @JsonProperty("type")
    private String type;

//    @JsonProperty("metadata")
//    private Metadata metadata;

    @JsonProperty("features")
    private List<Feature> features;

    @JsonProperty("bbox")
    private double[] bbox;

    public MainRequestDtoUSCG() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

//    public Metadata getMetadata() {
//        return metadata;
//    }
//
//    public void setMetadata(Metadata metadata) {
//        this.metadata = metadata;
//    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public double[] getBbox() {
        return bbox;
    }

    public void setBbox(double[] bbox) {
        this.bbox = bbox;
    }
}