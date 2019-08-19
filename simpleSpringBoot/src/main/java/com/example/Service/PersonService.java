package com.example.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Respository.PersonRepository;
import com.example.model.Employee;

@Service
public class PersonService {
	@Autowired
	PersonRepository personRespository;
	
	public Optional<Employee> getPerson(Long id) {
		return personRespository.findById(id);
	}
	
	public Iterable<Employee> getAll(){
		return personRespository.findAll();
	}

}
