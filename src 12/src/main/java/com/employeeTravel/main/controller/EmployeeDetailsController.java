package com.employeeTravel.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.employeeTravel.main.domain.EmployeeDetails;
import com.employeeTravel.main.domain.Login;
import com.employeeTravel.main.service.EmployeeDetailsService;
import com.employeeTravel.main.service.LoginServiceInterface;

@CrossOrigin("*")
@RestController
@RequestMapping("empdetailsApi")
public class EmployeeDetailsController {
	@Autowired
	private EmployeeDetailsService employeeDetailsService;

	@RequestMapping(value = "empdetails/{loginId}", method = RequestMethod.GET)
	public EmployeeDetails showEmp(@PathVariable int loginId) {
		
		System.out.println("In Controller");
		return employeeDetailsService.showEmployeeDetails(loginId);

	}
}
