package com.fis.demoproject.model;

public class Memory 
{
	private int ramSize;

	public Memory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Memory(int ramSize) {
		super();
		this.ramSize = ramSize;
	}

	public int getRamSize() {
		return ramSize;
	}

	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}

	@Override
	public String toString() {
		return "Memory [ramSize=" + ramSize + "]";
	}
	
}
