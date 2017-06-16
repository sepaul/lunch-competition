package com.ironyard.springboot.data;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Person {

	private String name;
	private String tag;
	private double avgLunchScore;
	private double avgPrice;
	
	@Id
	@GeneratedValue
	private long id;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<Lunch> lunches;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAvgLunchScore() {
		return avgLunchScore;
	}

	public void setAvgLunchScore(double avgLunchScore) {
		this.avgLunchScore = avgLunchScore;
	}

	public double getAvgPrice() {
		return avgPrice;
	}

	public void setAvgPrice(double avgPrice) {
		this.avgPrice = avgPrice;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<Lunch> getLunches() {
		return lunches;
	}

	public void setLunches(List<Lunch> lunches) {
		this.lunches = lunches;
	}
	
	
	
}
