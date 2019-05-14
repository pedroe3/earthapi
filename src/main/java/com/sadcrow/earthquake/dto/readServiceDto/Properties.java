package com.sadcrow.earthquake.dto.readServiceDto;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Properties {

    @JsonProperty("mag")
    private Double magnitude;

    @JsonProperty("place")
    private String place;

    @JsonProperty("time")
    private Long time;

    @JsonProperty("updated")
    private Long updated;

    @JsonProperty("tz")
    private Long tz;

    @JsonProperty("url")
    private String url;

    @JsonProperty("detail")
    private String detail;

    @JsonProperty("felt")
    private Long felt;

    @JsonProperty("cdi")
    private Double cdi;

    @JsonProperty("mmi")
    private Object mmi;

    @JsonProperty("alert")
    private Object alert;

    @JsonProperty("status")
    private String status;

    @JsonProperty("tsunami")
    private Long tsunami;

    @JsonProperty("sig")
    private Long sig;

    @JsonProperty("net")
    private String net;

    @JsonProperty("code")
    private String code;

    @JsonProperty("ids")
    private String ids;

    @JsonProperty("sources")
    private String sources;

    @JsonProperty("types")
    private String types;

    @JsonProperty("nst")
    private Long nst;

    @JsonProperty("dmin")
    private Double dmin;

    @JsonProperty("rms")
    private Double rms;

    @JsonProperty("gap")
    private Double gap;

    @JsonProperty("magType")
    private String magType;

    @JsonProperty("type")
    private String type;

    @JsonProperty("title")
    private String title;

    public Properties() {
    }

    public Double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(Double magnitude) {
        this.magnitude = magnitude;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Long getUpdated() {
        return updated;
    }

    public void setUpdated(Long updated) {
        this.updated = updated;
    }

    public Long getTz() {
        return tz;
    }

    public void setTz(Long tz) {
        this.tz = tz;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Long getFelt() {
        return felt;
    }

    public void setFelt(Long felt) {
        this.felt = felt;
    }

    public Double getCdi() {
        return cdi;
    }

    public void setCdi(Double cdi) {
        this.cdi = cdi;
    }

    public Object getMmi() {
        return mmi;
    }

    public void setMmi(Object mmi) {
        this.mmi = mmi;
    }

    public Object getAlert() {
        return alert;
    }

    public void setAlert(Object alert) {
        this.alert = alert;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getTsunami() {
        return tsunami;
    }

    public void setTsunami(Long tsunami) {
        this.tsunami = tsunami;
    }

    public Long getSig() {
        return sig;
    }

    public void setSig(Long sig) {
        this.sig = sig;
    }

    public String getNet() {
        return net;
    }

    public void setNet(String net) {
        this.net = net;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public String getSources() {
        return sources;
    }

    public void setSources(String sources) {
        this.sources = sources;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public Long getNst() {
        return nst;
    }

    public void setNst(Long nst) {
        this.nst = nst;
    }

    public Double getDmin() {
        return dmin;
    }

    public void setDmin(Double dmin) {
        this.dmin = dmin;
    }

    public Double getRms() {
        return rms;
    }

    public void setRms(Double rms) {
        this.rms = rms;
    }

    public Double getGap() {
        return gap;
    }

    public void setGap(Double gap) {
        this.gap = gap;
    }

    public String getMagType() {
        return magType;
    }

    public void setMagType(String magType) {
        this.magType = magType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
