package com.employeeTravel.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.employeeTravel.main.domain.BookingDetails;
import com.employeeTravel.main.domain.RequestDetails;
import com.employeeTravel.main.service.BookingDetailsService;
import com.employeeTravel.main.service.RequestDetailsService;

@CrossOrigin("*")
@RestController
@RequestMapping("bookingdetailsapi")
public class BookingDetailsController {
	
	@Autowired
	private BookingDetailsService bookingDetailsService;
	
	@RequestMapping(value = "addbookingdetail", method = RequestMethod.POST)
	public boolean addRequest(@RequestBody BookingDetails bookingDetails) {
		return bookingDetailsService.addBookingDetails( bookingDetails);
	}
	
	
	@RequestMapping(value = "viewbookingdetails", method = RequestMethod.GET)
	public List<BookingDetails> viewBookingDetails() {		
		System.out.println("In Controller");
		return bookingDetailsService.viewBookingDetails();
	}
	
}

