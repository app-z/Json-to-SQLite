package airoports;

import com.google.gson.annotations.Expose;

public class Airport {

	@Expose
	private String fs;
	@Expose
	private String iata;
	@Expose
	private String icao;
	@Expose
	private String name;
	@Expose
	private String city;
	@Expose
	private String cityCode;
	@Expose
	private String countryCode;
	@Expose
	private String countryName;
	@Expose
	private String regionName;
	@Expose
	private String timeZoneRegionName;
	@Expose
	private String localTime;
	@Expose
	private Float utcOffsetHours;
	@Expose
	private Double latitude;
	@Expose
	private Double longitude;
	@Expose
	private Integer elevationFeet;
	@Expose
	private Integer classification;
	@Expose
	private Boolean active;
	@Expose
	private String delayIndexUrl;
	@Expose
	private String weatherUrl;
	
	/**
	* 
	* @return
	* The fs
	*/
	public String getFs() {
	return fs;
	}

	/**
	* 
	* @param fs
	* The fs
	*/
	public void setFs(String fs) {
	this.fs = fs;
	}

	/**
	* 
	* @return
	* The iata
	*/
	public String getIata() {
	return iata;
	}

	/**
	* 
	* @param iata
	* The iata
	*/
	public void setIata(String iata) {
	this.iata = iata;
	}

	/**
	* 
	* @return
	* The icao
	*/
	public String getIcao() {
	return icao;
	}

	/**
	* 
	* @param icao
	* The icao
	*/
	public void setIcao(String icao) {
	this.icao = icao;
	}

	/**
	* 
	* @return
	* The name
	*/
	public String getName() {
	return name;
	}

	/**
	* 
	* @param name
	* The name
	*/
	public void setName(String name) {
	this.name = name;
	}

	/**
	* 
	* @return
	* The city
	*/
	public String getCity() {
	return city;
	}

	/**
	* 
	* @param city
	* The city
	*/
	public void setCity(String city) {
	this.city = city;
	}

	/**
	* 
	* @return
	* The cityCode
	*/
	public String getCityCode() {
	return cityCode;
	}

	/**
	* 
	* @param cityCode
	* The cityCode
	*/
	public void setCityCode(String cityCode) {
	this.cityCode = cityCode;
	}

	/**
	* 
	* @return
	* The countryCode
	*/
	public String getCountryCode() {
	return countryCode;
	}

	/**
	* 
	* @param countryCode
	* The countryCode
	*/
	public void setCountryCode(String countryCode) {
	this.countryCode = countryCode;
	}

	/**
	* 
	* @return
	* The countryName
	*/
	public String getCountryName() {
	return countryName;
	}

	/**
	* 
	* @param countryName
	* The countryName
	*/
	public void setCountryName(String countryName) {
	this.countryName = countryName;
	}

	/**
	* 
	* @return
	* The regionName
	*/
	public String getRegionName() {
	return regionName;
	}

	/**
	* 
	* @param regionName
	* The regionName
	*/
	public void setRegionName(String regionName) {
	this.regionName = regionName;
	}

	/**
	* 
	* @return
	* The timeZoneRegionName
	*/
	public String getTimeZoneRegionName() {
	return timeZoneRegionName;
	}

	/**
	* 
	* @param timeZoneRegionName
	* The timeZoneRegionName
	*/
	public void setTimeZoneRegionName(String timeZoneRegionName) {
	this.timeZoneRegionName = timeZoneRegionName;
	}

	/**
	* 
	* @return
	* The localTime
	*/
	public String getLocalTime() {
	return localTime;
	}

	/**
	* 
	* @param localTime
	* The localTime
	*/
	public void setLocalTime(String localTime) {
	this.localTime = localTime;
	}

	/**
	* 
	* @return
	* The utcOffsetHours
	*/
	public Float getUtcOffsetHours() {
	return utcOffsetHours;
	}

	/**
	* 
	* @param utcOffsetHours
	* The utcOffsetHours
	*/
	public void setUtcOffsetHours(Float utcOffsetHours) {
	this.utcOffsetHours = utcOffsetHours;
	}

	/**
	* 
	* @return
	* The latitude
	*/
	public Double getLatitude() {
	return latitude;
	}

	/**
	* 
	* @param latitude
	* The latitude
	*/
	public void setLatitude(Double latitude) {
	this.latitude = latitude;
	}

	/**
	* 
	* @return
	* The longitude
	*/
	public Double getLongitude() {
	return longitude;
	}

	/**
	* 
	* @param longitude
	* The longitude
	*/
	public void setLongitude(Double longitude) {
	this.longitude = longitude;
	}

	/**
	* 
	* @return
	* The elevationFeet
	*/
	public Integer getElevationFeet() {
	return elevationFeet;
	}

	/**
	* 
	* @param elevationFeet
	* The elevationFeet
	*/
	public void setElevationFeet(Integer elevationFeet) {
	this.elevationFeet = elevationFeet;
	}

	/**
	* 
	* @return
	* The classification
	*/
	public Integer getClassification() {
	return classification;
	}

	/**
	* 
	* @param classification
	* The classification
	*/
	public void setClassification(Integer classification) {
	this.classification = classification;
	}

	/**
	* 
	* @return
	* The active
	*/
	public Boolean getActive() {
	return active;
	}

	/**
	* 
	* @param active
	* The active
	*/
	public void setActive(Boolean active) {
	this.active = active;
	}

	/**
	* 
	* @return
	* The delayIndexUrl
	*/
	public String getDelayIndexUrl() {
	return delayIndexUrl;
	}

	/**
	* 
	* @param delayIndexUrl
	* The delayIndexUrl
	*/
	public void setDelayIndexUrl(String delayIndexUrl) {
	this.delayIndexUrl = delayIndexUrl;
	}

	/**
	* 
	* @return
	* The weatherUrl
	*/
	public String getWeatherUrl() {
	return weatherUrl;
	}

	/**
	* 
	* @param weatherUrl
	* The weatherUrl
	*/
	public void setWeatherUrl(String weatherUrl) {
	this.weatherUrl = weatherUrl;
	}

}