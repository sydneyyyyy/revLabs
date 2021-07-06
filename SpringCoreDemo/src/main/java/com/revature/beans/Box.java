package com.revature.beans;

public class Box {

	private int volume;
	
	public Box() {
		super();
	}
	
	public Box(int volume) {
		this.volume = volume;
	}

	public int getVolume() {
		return this.volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	@Override
	public String toString() {
		return "Box [volume=" + volume + "]";
	}
	
	
	
}
