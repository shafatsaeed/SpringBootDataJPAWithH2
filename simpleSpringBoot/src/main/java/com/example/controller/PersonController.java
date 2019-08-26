package com.example.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.PersonService;
import com.example.model.Employee;

@RestController
@RequestMapping("/person")
public class PersonController {
	@Autowired
	PersonService personService;
	
	 @GetMapping("/all")
	public Iterable<Employee> getAll(){
		return personService.getAll();
	}
	
	@RequestMapping("/{id}")
	public Employee getPerson(@PathVariable("id") Long id) {
		 Optional<Employee> person = personService.getPerson(id);
		 return person.get();
	}
}
