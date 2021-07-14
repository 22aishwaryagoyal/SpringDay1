package com.fis.demoproject.model;

import java.io.Serializable;

public class ElectronicDevice implements Serializable,Comparable<ElectronicDevice>
{
	private int deviceId;
	private String deviceName;
	private int price;
	private int Rating;
	private String color;
	private Battery b;
	private Memory m;
	public ElectronicDevice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ElectronicDevice(int  deviceId, String deviceName, int price, int rating, String color) {
		super();
		this. deviceId =  deviceId;
		deviceName = deviceName;
		this.price = price;
		Rating = rating;
		this.color = color;
	}
	
	public int getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRating() {
		return Rating;
	}
	public void setRating(int rating) {
		Rating = rating;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Battery getB() {
		return b;
	}
	public void setB(Battery b) {
		this.b = b;
	}
	public Memory getM() {
		return m;
	}
	public void setM(Memory m) {
		this.m = m;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deviceName == null) ? 0 : deviceName.hashCode());
		result = prime * result + Rating;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result +  deviceId;
		result = prime * result + price;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ElectronicDevice other = (ElectronicDevice) obj;
		if (deviceName == null) {
			if (other.deviceName != null)
				return false;
		} else if (!deviceName.equals(other.deviceName))
			return false;
		if (Rating != other.Rating)
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if ( deviceId != other. deviceId)
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	@Override
	public String toString() {
		if(b == null)
		{
			return deviceName+"- Battery Not Yet Set  - "+deviceId+" - "+m;
		}
		return deviceName+" - "+b.getBatteryName()+" - "+deviceId+" - "+m;
		
	}
	public int compareTo(ElectronicDevice o) {
		
		return this.deviceName.compareTo(o.deviceName);
	}
	
}
