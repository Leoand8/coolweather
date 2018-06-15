package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author liubin
 * @version 1.0
 * @description
 * @created at 2018/6/15 015 8:55
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort{
        @SerializedName("txt")
        public String info;
    }

    public class CarWash{
        @SerializedName("txt")
        public String info;
    }

    public class Sport{
        @SerializedName("txt")
        public String info;
    }
}
