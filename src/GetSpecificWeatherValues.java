package com.plugin.awesomejava.Forecast;

import java.util.Date;
import javax.swing.ImageIcon;

public class GetSpecificWeatherValues {

    private String DateInformations;
    private String MaxTemperature;
    private String MinTemperature;

    private String Datetemperature;
    private Date DayofWeek;
    private ImageIcon MainWeatherIcon;
    private ImageIcon WeatherIcon;
    private boolean CurrentDay = false;


    public GetSpecificWeatherValues() {
    }

    public void ForecastValues1(String DateInformations, String DateTemperature, String Humidity) {
        this.DateInformations = DateInformations;
        this.Datetemperature = DateTemperature;
    
    }

    public void ForecastValues1(String DateInformations, String Datetemperature, String MaxTemperature,
            String MinTemperature) {
        this.DateInformations = DateInformations;
        this.Datetemperature = Datetemperature;
        this.MaxTemperature = MaxTemperature;
        this.MinTemperature = MinTemperature;
        
    }

    public void ForecastValues(String DateInformations, String Datetemperature, String MaxTemperature, String MinTemperature) {
        this.DateInformations = DateInformations;
        this.Datetemperature = Datetemperature;
        this.MaxTemperature = MaxTemperature;
        this.MinTemperature = MinTemperature;

    }

    public void ForecastValues1(String DateInformations, String MaxTemperature, String MinTemperature, String Datetemperature, Date DayofWeek,
            ImageIcon WeatherIcon) {
        this.DateInformations = DateInformations;
        this.MaxTemperature = MaxTemperature;
        this.MinTemperature = MinTemperature;
        this.Datetemperature = Datetemperature;
    
    }

    public void setDateInformations(String DateInformations) {
        this.DateInformations = DateInformations;
    }

    public void setMinTemperature(String MinTemperature) {
        this.MinTemperature = MinTemperature;
    }

    public void setMaxTemperature(String MaxTemperature) {
        this.MaxTemperature = MaxTemperature;
    }

    public void setDateTemperature(String DateTemperature) {
        this.Datetemperature = DateTemperature;
    }

    public void setCurrentDay(boolean CurrentDay) {
        this.CurrentDay = CurrentDay;
    }

    public void setWeatherIcon(ImageIcon WeatherIcon) {
        this.WeatherIcon = WeatherIcon;
    }

    public void setDayofWeek(Date DayofWeek) {
        this.DayofWeek = DayofWeek;
    }

    public void setMainWeatherIcon(ImageIcon MainWeatherIcon) {
        this.MainWeatherIcon = MainWeatherIcon;
    }

    public ImageIcon getMainWeatherIcon() {
        return MainWeatherIcon;
    }

    public String getDateTemperature() {
        return Datetemperature;
    }

    public String getDateInformations() {
        return DateInformations;
    }

    public String getMaxTemperature() {
        return MaxTemperature;
    }

    public String getMinTemperature() {
        return MinTemperature;
    }

    public String getDescription() {
        return Description;
    }

    public Date getDayofWeek() {
        return DayofWeek;
    }

    public ImageIcon getWeatherIcon() {
        return WeatherIcon;
    }

    public boolean isCurrentDay() {
        return CurrentDay;
    }

    @Override
    public String toString() {
        return DateInformations + " ,"
                + Datetemperature + " ,"
                + MaxTemperature + " ,"
                + MinTemperature + " ,";
    }

}
