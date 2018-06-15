package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author liubin
 * @version 1.0
 * @description
 * @created at 2018/6/15 015 8:58
 */

public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature{
        public String max;
        public String min;
    }

    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
