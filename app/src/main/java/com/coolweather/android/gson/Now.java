package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 小巷有狗 on 2018/1/26.
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
