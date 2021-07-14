package com.fis.demoproject.model;

public class Battery {

	
	private String batteryName;
	private int power;
	public Battery() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Battery(String batteryName, int power) {
		super();
		this.batteryName = batteryName;
		this.power = power;
	}
	public String getBatteryName() {
		return batteryName;
	}
	public void setBatteryName(String batteryName) {
		this.batteryName = batteryName;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	@Override
	public String toString() {
		return "Battery [batteryName=" + batteryName + ", power=" + power + "]";
	}
	

}
