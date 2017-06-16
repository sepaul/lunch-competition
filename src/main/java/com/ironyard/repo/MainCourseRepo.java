package com.ironyard.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ironyard.springboot.data.MainCourse;

public interface MainCourseRepo extends PagingAndSortingRepository<MainCourse, Long> {

}
