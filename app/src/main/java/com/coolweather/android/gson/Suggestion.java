package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 小巷有狗 on 2018/1/26.
 */

public class Suggestion {

    @SerializedName("conf")
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
