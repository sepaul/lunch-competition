package com.ironyard.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.ironyard.springboot.data.Person;

public interface PersonRepository extends PagingAndSortingRepository<Person,Long>{

}
