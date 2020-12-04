package com.example.coolweather.gson;

public class AQI {
    public AQIcity city;
    public class AQIcity{
        public String aqi;
        public String pm25;

    }

    @Override
    public String toString() {
        return "AQI{" +
                "city=" + city +
                '}';
    }
}
