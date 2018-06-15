package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author liubin
 * @version 1.0
 * @description
 * @created at 2018/6/15 015 8:48
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
