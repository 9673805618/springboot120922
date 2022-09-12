package com.employeeTravel.main.repository;

import java.util.List;

import com.employeeTravel.main.domain.BookingDetails;
import com.employeeTravel.main.domain.RequestDetails;

public interface BookingDetailsRepositoryInterface {
	public List<BookingDetails> viewBookingDetails();
	public boolean addBookingDetails(BookingDetails bookingDetails);
	
}
