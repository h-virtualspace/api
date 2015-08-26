package com.virtualspace.database.model;

public class PosQueryCondition 
{
	private double lon;
	private double lat;
	private double maxDisByl;
	private int limit;
	private String sortType;
	public double getLon() {
		return lon;
	}
	public void setLon(double lon) {
		this.lon = lon;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getMaxDisByl() {
		return maxDisByl;
	}
	public void setMaxDisByl(double maxDisByl) {
		this.maxDisByl = maxDisByl;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public String getSortType() {
		return sortType;
	}
	public void setSortType(String sortType) {
		this.sortType = sortType;
	}
}
