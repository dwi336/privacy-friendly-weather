package org.secuso.privacyfriendlyweather.database;

/**
 * This class represents the database model for current weather data of cities.
 */

public class CurrentWeatherData  {

    private int id;
    private int city_id;
    private long timestamp;
    private int weatherID;
    private float temperatureCurrent;
    private float temperatureMin;
    private float temperatureMax;
    private float humidity;
    private float pressure;
    private float windSpeed;
    private float windDirection;
    private float cloudiness;
    private long timeSunrise;
    private long timeSunset;
    private int timeZoneSeconds;

    private String city_name;

    public CurrentWeatherData() {
        this.city_id = Integer.MIN_VALUE;
    }

    public CurrentWeatherData(int id, int city_id, long timestamp, int weatherID, float temperatureCurrent, float temperatureMin, float temperatureMax, float humidity, float pressure, float windSpeed, float windDirection, float cloudiness, long timeSunrise, long timeSunset, int timeZoneSeconds) {
        this.id = id;
        this.city_id = city_id;
        this.timestamp = timestamp;
        this.weatherID = weatherID;
        this.temperatureCurrent = temperatureCurrent;
        this.temperatureMin = temperatureMin;
        this.temperatureMax = temperatureMax;
        this.humidity = humidity;
        this.pressure = pressure;
        this.windSpeed = windSpeed;
        this.windDirection = windDirection;
        this.cloudiness = cloudiness;
        this.timeSunrise = timeSunrise;
        this.timeSunset = timeSunset;
        this.timeZoneSeconds=timeZoneSeconds;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public int getWeatherID() {
        return weatherID;
    }

    public void setWeatherID(int weatherID) {
        this.weatherID = weatherID;
    }

    public float getTemperatureCurrent() {
        return temperatureCurrent;
    }

    public void setTemperatureCurrent(float temperatureCurrent) {
        this.temperatureCurrent = temperatureCurrent;
    }

    public float getTemperatureMin() {
        return temperatureMin;
    }

    public void setTemperatureMin(float temperatureMin) {
        this.temperatureMin = temperatureMin;
    }

    public float getTemperatureMax() {
        return temperatureMax;
    }

    public void setTemperatureMax(float temperatureMax) {
        this.temperatureMax = temperatureMax;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(float windSpeed) {
        this.windSpeed = windSpeed;
    }

    public float getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(float windDirection) {
        this.windDirection = windDirection;
    }

    public float getCloudiness() {
        return cloudiness;
    }

    public void setCloudiness(float cloudiness) {
        this.cloudiness = cloudiness;
    }

    public long getTimeSunrise() {
        return timeSunrise;
    }

    public void setTimeSunrise(long timeSunrise) {
        this.timeSunrise = timeSunrise;
    }

    public long getTimeSunset() {
        return timeSunset;
    }

    public void setTimeSunset(long timeSunset) {
        this.timeSunset = timeSunset;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public int getTimeZoneSeconds() { return timeZoneSeconds; }

    public void setTimeZoneSeconds(int timeZoneSeconds) { this.timeZoneSeconds = timeZoneSeconds; }
}
