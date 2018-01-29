package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 小巷有狗 on 2018/1/26.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
