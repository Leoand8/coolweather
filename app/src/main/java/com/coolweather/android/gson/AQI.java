package com.coolweather.android.gson;

/**
 * @author liubin
 * @version 1.0
 * @description
 * @created at 2018/6/15 015 8:52
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
