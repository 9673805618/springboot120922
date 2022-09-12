package com.employeeTravel.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeTravel.main.domain.Login;
import com.employeeTravel.main.repository.LoginRepositoryInterface;

@Service
public class LoginService implements LoginServiceInterface {
	@Autowired
	LoginRepositoryInterface LoginRepositoryInterface;

	@Override
	public Login validationUser(Login login) {
		// TODO Auto-generated method stub
		return LoginRepositoryInterface.validationUser(login);
	}

}
