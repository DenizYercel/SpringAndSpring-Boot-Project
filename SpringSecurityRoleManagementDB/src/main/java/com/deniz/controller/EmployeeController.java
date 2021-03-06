package com.deniz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@GetMapping("/home")
	public String showEmployeePage() {
		return "employee-home";
	}
	
	@GetMapping("/task")
	public String employeeTasks() {
		return "employee-tasks";
	}
	
}
