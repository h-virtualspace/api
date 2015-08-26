package com.virtualspace.util;

public class DistanceUtil 
{
	/**
	 * 计算地球上任意两点(经纬度)距离
	 * 
	 * @param flon
	 *            第一点经度
	 * @param flat
	 *            第一点纬度
	 * @param slon
	 *            第二点经度
	 * @param slat
	 *            第二点纬度
	 * @return 返回距离 单位：米
	 */
	private final static double EARTH_RADIUS = 6378.137;
	private static double rad(double d)
	{
	   return d * Math.PI / 180.0;
	}

	public static double getDistance(double flon, double flat, double slon, double slat)
	{
	   double radLat1 = rad(flat);
	   double radLat2 = rad(slat);
	   double a = radLat1 - radLat2;
	   double b = rad(flon) - rad(slon);
	   double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a/2),2) + Math.cos(radLat1)*Math.cos(radLat2)*Math.pow(Math.sin(b/2),2)));
	   s = s * EARTH_RADIUS;
	   s = Math.round(s * 10000) / 10000;
	   return s;
	}
}
