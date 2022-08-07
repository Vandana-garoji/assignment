package com.spring.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.demo.model.Employee;
import com.spring.demo.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository repository;
	
	@PostMapping("/addEmployee")
	public String saveEmployee(@RequestBody Employee employee) {
		  //  System.out.println(employee.toString());
           repository.save(employee);
	      return "Added Employee";
}
	@GetMapping("/findAllEmployees")
	public List<Employee> getEmployees(){
		return repository.findAll();
	}
	
	@GetMapping("/findEmployeeById/{eid}")
	public Optional<Employee> getEmployeeById(@PathVariable int eid){
		return repository.findById(eid);
	}
	
	@DeleteMapping("/delete/{eid}")
	public String deleteEmployee(@PathVariable int eid) {
		repository.deleteById(eid);
		return "Employee deleted";
	}
	
	
	}
