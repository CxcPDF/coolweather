package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 小巷有狗 on 2018/1/26.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;//县的名字
    private String weatherId;//县所对应的天气
    private int cityId;//当前县所属的市的代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
