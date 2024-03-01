package com.telusko.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.pojo.Course;

@RestController
public class CourseRestController 
{
	@PostMapping(value="/courseinfo",
			consumes= {"application/xml","application/json"}
	)
	public ResponseEntity<String> addCourseInfo()
	{
		String msg="Course info stored in db";
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
	}
	
	@GetMapping(
			value="/courseinfo",produces={"application/xml","application/json"}
	)
	public Course getCourse()
	{
		//retrieve this from db
		Course course=new Course();
		course.setCid(101);
		course.setCname("DevOps");
		course.setPrice(4545.6);
		return course;
	}
}
