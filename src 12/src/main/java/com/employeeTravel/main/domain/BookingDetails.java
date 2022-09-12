package com.employeeTravel.main.domain;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Objects;

public class BookingDetails {
	private int bookingId;
	private double travelCost;
	private String hotelName;
	private String checkIn;
	private String checkOut;
	private String departureTime;
	private String arrivalTime;
	private RequestDetails requestDetails;

	public BookingDetails() {
		
	}

	public BookingDetails(int bookingId, double travelCost, String hotelName, String checkIn, String checkOut,
			String departureTime, String arrivalTime, RequestDetails requestDetails) {
		super();
		this.bookingId = bookingId;
		this.travelCost = travelCost;
		this.hotelName = hotelName;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.requestDetails = requestDetails;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public double getTravelCost() {
		return travelCost;
	}

	public void setTravelCost(double travelCost) {
		this.travelCost = travelCost;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}

	public String getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public RequestDetails getRequestDetails() {
		return requestDetails;
	}

	public void setRequestDetails(RequestDetails requestDetails) {
		this.requestDetails = requestDetails;
	}

	@Override
	public int hashCode() {
		return Objects.hash(arrivalTime, bookingId, checkIn, checkOut, departureTime, hotelName, requestDetails,
				travelCost);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookingDetails other = (BookingDetails) obj;
		return Objects.equals(arrivalTime, other.arrivalTime) && bookingId == other.bookingId
				&& Objects.equals(checkIn, other.checkIn) && Objects.equals(checkOut, other.checkOut)
				&& Objects.equals(departureTime, other.departureTime) && Objects.equals(hotelName, other.hotelName)
				&& Objects.equals(requestDetails, other.requestDetails)
				&& Double.doubleToLongBits(travelCost) == Double.doubleToLongBits(other.travelCost);
	}

	@Override
	public String toString() {
		return "BookingDetails [bookingId=" + bookingId + ", travelCost=" + travelCost + ", hotelName=" + hotelName
				+ ", checkIn=" + checkIn + ", checkOut=" + checkOut + ", departureTime=" + departureTime
				+ ", arrivalTime=" + arrivalTime + ", requestDetails=" + requestDetails + "]";
	}
	

	

	
}
