package com.employeeTravel.main.domain;

import java.time.LocalDate;
import java.util.Objects;

public class RequestDetails {
	private int requestId;
	private EmployeeDetails employeeDetails;
	private String departureLocation;
	private String destination;
	private String modeOfTravel;
	private String purposeOfTravelling;
	private LocalDate departureDate;
	private LocalDate arrivalDate;
	private String status;
	private DocumentsDetails documentsDetails;

	public RequestDetails() {
		// TODO Auto-generated constructor stub
	}

	public RequestDetails(int requestId, EmployeeDetails employeeDetails, String departureLocation, String destination,
			String modeOfTravel, String purposeOfTravelling, LocalDate departureDate, LocalDate arrivalDate,
			String status, DocumentsDetails documentsDetails) {
		super();
		this.requestId = requestId;
		this.employeeDetails = employeeDetails;
		this.departureLocation = departureLocation;
		this.destination = destination;
		this.modeOfTravel = modeOfTravel;
		this.purposeOfTravelling = purposeOfTravelling;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
		this.status = status;
		this.documentsDetails = documentsDetails;
	}

	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	public EmployeeDetails getEmployeeDetails() {
		return employeeDetails;
	}

	public void setEmployeeDetails(EmployeeDetails employeeDetails) {
		this.employeeDetails = employeeDetails;
	}

	public String getDepartureLocation() {
		return departureLocation;
	}

	public void setDepartureLocation(String departureLocation) {
		this.departureLocation = departureLocation;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getModeOfTravel() {
		return modeOfTravel;
	}

	public void setModeOfTravel(String modeOfTravel) {
		this.modeOfTravel = modeOfTravel;
	}

	public String getPurposeOfTravelling() {
		return purposeOfTravelling;
	}

	public void setPurposeOfTravelling(String purposeOfTravelling) {
		this.purposeOfTravelling = purposeOfTravelling;
	}

	public LocalDate getDepartureDate() {
		return departureDate;
	}

	public void setDepatureDate(LocalDate depatureDate) {
		this.departureDate = depatureDate;
	}

	public LocalDate getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public DocumentsDetails getDocumentsDetails() {
		return documentsDetails;
	}

	public void setDocumentsDetails(DocumentsDetails documentsDetails) {
		this.documentsDetails = documentsDetails;
	}

	@Override
	public String toString() {
		return "RequestDetails [requestId=" + requestId + ", employeeDetails=" + employeeDetails
				+ ", departureLocation=" + departureLocation + ", destination=" + destination + ", modeOfTravel="
				+ modeOfTravel + ", purposeOfTravelling=" + purposeOfTravelling + ", departureDate=" + departureDate
				+ ", arrivalDate=" + arrivalDate + ", status=" + status + ", documentsDetails=" + documentsDetails
				+ "]";
	}

}
