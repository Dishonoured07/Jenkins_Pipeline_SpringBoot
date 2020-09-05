package com.luv2code.springboot.cruddemo.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class EmployeeRestController {

//	private EmployeeService employeeService;
//
//	@Autowired
//	public EmployeeRestController(EmployeeService theEmployeeService) {
//		employeeService = theEmployeeService;
//	}

	@GetMapping("/employeesstring")
	public String GetMsg() {
		return "Hello Soumyajit";
	}

}
