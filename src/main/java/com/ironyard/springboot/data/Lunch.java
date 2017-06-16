package com.ironyard.springboot.data;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Lunch {
	
	private double price;
	private String mainCourse;
	private ArrayList<String> sides = new ArrayList<String>();
	private String drink;
	private double rating;
	private String lunchName;
	
	@Id
	@GeneratedValue
	private long lunchId;
	
	public long getLunchId() {
		return lunchId;
	}

	public void setLunchId(long lunchId) {
		this.lunchId = lunchId;
	}
	
	public String getLunchName() {
		return lunchName;
	}

	public void setLunchName(String lunchId) {
		this.lunchName = lunchId;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getMainCourse() {
		return mainCourse;
	}

	public void setMainCourse(String mainCourse) {
		this.mainCourse = mainCourse;
	}

	public ArrayList<String> getSides() {
		return sides;
	}

	public void setSides(ArrayList<String> sides) {
		this.sides = sides;
	}

	public String getDrink() {
		return drink;
	}

	public void setDrink(String drink) {
		this.drink = drink;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}


}
