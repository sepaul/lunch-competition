package com.ironyard.springboot.data;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Lunch {
	
	private double price;
	private ArrayList<String> mainCourse = new ArrayList<String>(); 
	private ArrayList<String> sides = new ArrayList<String>();//TODO: change to Side object
	private String drink;// change to drink object
	private double rating;
	private String lunchName;
	private String comment; 
	
	@Id
	@GeneratedValue
	private long lunchId;
	
	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setMainCourse(ArrayList<String> mainCourse) {
		this.mainCourse = mainCourse;
	}

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

	public ArrayList<String> getMainCourse() {
		return mainCourse;
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
