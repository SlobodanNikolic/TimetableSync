package com.example.timetableService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimetableController {

	 @Autowired
	  private Environment environment;
	 
	 @Autowired
	 private TimetableRepository repository;
	 
	 
	 @GetMapping("/admin/timetable")
	 public List<Subject> getTimetable(){
		 List<Subject> subject = repository.findAll();
		 return subject;
	 }
	 
	 @GetMapping("/admin/timetable/new")
	 ResponseEntity<?> add(@RequestBody Timetable input){
		
	 }
}
