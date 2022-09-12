package com.employeeTravel.main.service;

import java.util.List;

import com.employeeTravel.main.domain.BookingDetails;

public interface BookingDetailsServiceInterface {
	public List<BookingDetails> viewBookingDetails();
	public boolean addBookingDetails(BookingDetails bookingDetails);
}
