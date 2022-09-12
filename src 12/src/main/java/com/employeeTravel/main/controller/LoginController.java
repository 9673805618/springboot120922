package com.employeeTravel.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.employeeTravel.main.domain.Login;
import com.employeeTravel.main.service.LoginServiceInterface;

@CrossOrigin("*")
@RestController
@RequestMapping("loginapi")
public class LoginController {
	@Autowired
	private LoginServiceInterface loginService;

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public Login verifyUser(@RequestBody Login login) {

		return loginService.validationUser(login);

	}
}
