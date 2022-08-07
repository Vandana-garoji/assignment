package com.spring.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.demo.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, Integer> {

}
