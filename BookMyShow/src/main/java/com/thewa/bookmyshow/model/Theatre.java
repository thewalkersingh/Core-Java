package com.thewa.bookmyshow.model;
import java.util.ArrayList;
import java.util.List;

public class Theatre {
	private final String name; // Assumption: the name is unique
	private final Location location;
	private final int totalHalls;
	private final List<Hall> halls;
	
	public Theatre(String name, Location location, int totalHalls) {
		this.name = name;
		this.location = location;
		this.totalHalls = totalHalls;
		this.halls = new ArrayList<>(totalHalls);
	}
	
	public boolean addHall(Hall hall) {
		if (this.halls.size() < totalHalls) {
			this.halls.add(hall);
			return true;
		}
		
		return false;
	}
	
	public String getName() {
		return name;
	}
	
	public Location getLocation() {
		return location;
	}
	
	public int getTotalHalls() {
		return totalHalls;
	}
	
	public List<Hall> getHalls() {
		return halls;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
}