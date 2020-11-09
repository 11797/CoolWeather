package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

public class Country extends DataSupport {
    private int id;
    private int cityId;
    private String weatherId;
    private String countryName;

    public int getId() {
        return id;
    }

    public int getCityId() {
        return cityId;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }
}
