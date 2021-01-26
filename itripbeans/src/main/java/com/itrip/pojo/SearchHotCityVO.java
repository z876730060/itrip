package com.itrip.pojo;

public class SearchHotCityVO {

    int cityId;

    int count;

    public int getCityId() {
        return cityId;
    }

    public SearchHotCityVO setCityId(int cityId) {
        this.cityId = cityId;
        return this;
    }

    public int getCount() {
        return count;
    }

    public SearchHotCityVO setCount(int count) {
        this.count = count;
        return this;
    }
}
