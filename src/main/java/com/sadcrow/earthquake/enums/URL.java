package com.sadcrow.earthquake.enums;

public enum URL {
    UscgApi("https://earthquake.usgs.gov/fdsnws/event/1/")
            ;

    private final String url;

    URL(final String url){
        this.url = url;
    }


    public String getUrl(){
        return url;
    }
}


//String url = "https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime=2019-02-15";