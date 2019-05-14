package com.sadcrow.earthquake.helpers;


import com.sadcrow.earthquake.error.CoordinatesNotValidException;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;

public class EventLocation {

    private Double longitude;

    private Double latitude;

    private Double elevation;

    private Point point;

    private GeoJsonPoint geoJsonPoint;

    private Boolean isValidCoordinates;

    public EventLocation(Double longitude, Double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;

        this.calcIsValidCoordinates();
        if(this.isValidCoordinates) {
            this.setJsonPoint();
            this.setPoint();
        } else {
            throw new CoordinatesNotValidException("coordinates out of range 1 - Pedro");
        }
    }

    public EventLocation(double[] geoJsonPoint) {
        this.longitude = geoJsonPoint[0];
        this.latitude = geoJsonPoint[1];
        //this.elevation = geoJsonPoint[3];

        this.calcIsValidCoordinates();
        if(this.isValidCoordinates) {
            this.setJsonPoint();
            this.setPoint();
        } else {
            throw new CoordinatesNotValidException("coordinates out of range 2 - Pedro");
        }

    }

    private void calcIsValidCoordinates() {
        this.isValidCoordinates = this.latitude >= -90 && this.latitude <= 90 && this.longitude >= -180 && this.longitude <= 180;
    }

    public Boolean getIsValidCoordinates(){
        return isValidCoordinates;
    }

    private void setJsonPoint(){
       this.geoJsonPoint = new GeoJsonPoint(this.longitude, this.latitude);
    }



    private void setPoint(){
//        List<Double> coordinates = new ArrayList<>();
//        coordinates.add(this.latitude);
//        coordinates.add(this.longitude);
//        Position position = new Position(coordinates);


        this.point = new Point(this.longitude, this.latitude);
    }

    public GeoJsonPoint getGeoJsonPoint() {
        return this.geoJsonPoint;
    }

    public Point getPoint() { return this.point; }

    public void setGeoJsonPoint(GeoJsonPoint geoJsonPoint) {
        this.geoJsonPoint = geoJsonPoint;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public void setElevation(Double elevation) {
        this.elevation = elevation;
    }
}
