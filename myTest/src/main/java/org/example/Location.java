package org.example;

/**
 * @program: oo-java
 * @description: location
 * @author: 郭晨旭
 * @create: 2023-05-29 14:21
 * @version: 1.0
 */
public class Location {

    private String name;
    private String id;
    private String lat;
    private String lon;
    private String adm2;
    private String adm1;
    private String country;
    private String tz;
    private String utcOffset;
    private String isDst;
    private String type;
    private String rank;
    private String fxLink;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLat() {
        return lat;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getLon() {
        return lon;
    }

    public void setAdm2(String adm2) {
        this.adm2 = adm2;
    }

    public String getAdm2() {
        return adm2;
    }

    public void setAdm1(String adm1) {
        this.adm1 = adm1;
    }

    public String getAdm1() {
        return adm1;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setTz(String tz) {
        this.tz = tz;
    }

    public String getTz() {
        return tz;
    }

    public void setUtcOffset(String utcOffset) {
        this.utcOffset = utcOffset;
    }

    public String getUtcOffset() {
        return utcOffset;
    }

    public void setIsDst(String isDst) {
        this.isDst = isDst;
    }

    public String getIsDst() {
        return isDst;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    public void setFxLink(String fxLink) {
        this.fxLink = fxLink;
    }

    public String getFxLink() {
        return fxLink;
    }

}
