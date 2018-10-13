package com.plugin.awesomejava.Forecast;


public class GetWeather {

    private static final String ApiKey = "305be23140a9d5d08890247143be3227";
    private String Location;
    private String StateCode;
    private int Days;
    
    
    public GetWeather() {
    }

    public void FeedEntry(String Location, String StateCode, int Days) {
        this.Location = Location;
        this.StateCode = StateCode;
        this.Days = Days;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public void setStateCode(String StateCode) {
        this.StateCode = StateCode;
    }

    public void setDays(int Days) {
        this.Days = Days;
    }

    public int getDays() {
        return Days;
    }

    public String getLocation() {
        return Location;
    }

    public String getStateCode() {
        return StateCode;
    }

    public String getApiKey() {
        return ApiKey;
    }

    @Overrides // the built in string method
    public String toString() {
        return super.toString();
    }

}

