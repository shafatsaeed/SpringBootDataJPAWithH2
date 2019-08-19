package com.example.Respository;

import org.springframework.stereotype.Repository;

import com.example.model.Employee;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface PersonRepository extends CrudRepository<Employee, Long>{

}
