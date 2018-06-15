package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author liubin
 * @version 1.0
 * @description
 * @created at 2018/6/15 015 8:53
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
