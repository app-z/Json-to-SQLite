Json-to-SQLite
==============

Json to SQLite example


This code convert Json string from file to SQLite database


How to use

Create sqlite convertor
```
SQLiteDB sqlite = new SQLiteDB();
```
Create gson parser
```
Gson gson = new Gson();
```
Load Json string from disk
```
String jStr = LoadAssetFile("airports.json");
```
Parse Json objects in your Java classes
```
Airports airoports = gson.fromJson(jStr, Airports.class);
```
Convert your Classes to SQLite Database
```
sqlite.createDb("airports.db", airoports.getClass().getSimpleName()
    .toLowerCase(), airoports.getAirports(),
    Airport.class.getDeclaredFields());
```
Parametrs

1. SQLite Database Name
2. Table name
3. List Objects
4. Fields of Class. This fields will be column name in database

Example

Input class
```
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
```

To be converted to column names
```
CREATE TABLE airports (
_id INTEGER, fs TEXT, iata TEXT, icao TEXT, name TEXT, city TEXT, cityCode TEXT, countryCode TEXT, countryName TEXT, regionName TEXT, timeZoneRegionName TEXT, localTime TEXT, utcOffsetHours FLOAT, latitude REAL, longitude REAL, elevationFeet INTEGER, classification INTEGER, active BOOLEAN, delayIndexUrl TEXT, weatherUrl TEXT);
```


Enjoy ;-)

=================

The MIT License

Copyright (c) 2014 Appz (http://app-z.net)

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
