package com.ironyard.springboot.controller;

import java.util.Collection;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ironyard.repo.PersonRepository;
import com.ironyard.repo.LunchRepository;
import com.ironyard.springboot.data.Person;
import com.ironyard.springboot.data.Lunch;

@RestController
public class LunchController { 
	
	
	@Autowired
	private LunchRepository myLunchRepo;
	
	@Autowired
	private PersonRepository myPersonRepo;
	
	
	@RequestMapping(value="/person", method = RequestMethod.POST)
	public Person createOrder(@RequestBody Person createPerson){
		myPersonRepo.save(createPerson);
		return createPerson;
	}
	
	
	/**
	 * Create a new Lunch
	 * @param createLunch
	 * @return populated Lunch
	 */
	@RequestMapping(value="/makeLunch", method = RequestMethod.POST)
	public Lunch makeLunch(@RequestBody Lunch createLunch){
		myLunchRepo.save(createLunch);
		return createLunch;
	}

	/**
	 * Gets all Lunches from DB
	 * @return all Lunches
	 */
	@RequestMapping(value= "/lunches", method= RequestMethod.GET)
	public Page getLunches(@RequestParam("page") Integer page,
			@RequestParam("size") Integer size,
			@RequestParam(value= "sortby", required = false) String sortby,
			@RequestParam(value = "dir", required = false) Sort.Direction direction){
		if(sortby == null){
			sortby ="lunchId";
		}
		
		if(direction ==null){
			direction = Sort.Direction.DESC;
		}
		
		Sort s = new Sort(direction, sortby);
		PageRequest pr = new PageRequest(page,size,s);
		Page data = myLunchRepo.findAll(pr);
		return data;
	}
	
	@RequestMapping(value ="/persons", method= RequestMethod.GET)
	public Page getPeople(@RequestParam("page") Integer page,
			@RequestParam("size") Integer size,
			@RequestParam(value="sortby", required = false) String sortby,
			@RequestParam(value = "dir", required = false) Sort.Direction direction){
		if(sortby == null){
			sortby = "id";
		}
		
		if(direction ==null){
			direction = Sort.Direction.DESC;
		}
		
		Sort s = new Sort(direction, sortby);
		PageRequest pr = new PageRequest(page,size,s);
		Page data = myPersonRepo.findAll(pr);
		return data;
	}
	
	/**
	 * Finds a Lunch by it's ID
	 * @param id
	 * @return a Lunch
	 */
	@RequestMapping(value= "/lunches/{id}", method= RequestMethod.GET)
	public Lunch get(@PathVariable Long id){
		return myLunchRepo.findOne(id);
	}
		
	/**
	 * Update the Lunch
	 * @param name
	 * 
	 */
	@RequestMapping(value = "/lunch", method = RequestMethod.PUT)
	public void updateSize(@RequestBody Lunch updateLunch){
		myLunchRepo.save(updateLunch);
		
	}

		
	
	
}
