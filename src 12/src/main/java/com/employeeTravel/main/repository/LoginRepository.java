package com.employeeTravel.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.employeeTravel.main.domain.Login;

@Repository
public class LoginRepository implements LoginRepositoryInterface {

	private static final String VALIDATE_USER = "Select * from login_details where user_id= ? and password = ?";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Login validationUser(Login login) {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject(VALIDATE_USER, new LoginRowMapper(), login.getUserId(), login.getPassword());
	}

	public class LoginRowMapper implements RowMapper<Login> {

		@Override
		public Login mapRow(ResultSet rs, int rowNum) throws SQLException {
			int loginId = rs.getInt("login_id");
			String userID = rs.getString("user_id");
			String password = rs.getString("password");
			String designation = rs.getString("designation");
			Login login = new Login(loginId, userID, password, designation);
			return login;
		}
	}

}
