package com.employeeTravel.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeTravel.main.domain.RequestDetails;
import com.employeeTravel.main.repository.RequestDetailsRepository;
import com.employeeTravel.main.repository.RequestDetailsRepositoryInterface;
@Service
public class RequestDetailsService implements RequestDetailsServiceInterface {

	@Autowired
	RequestDetailsRepositoryInterface requestDetailsRepositoryInterface;
	
	@Override
	public List<RequestDetails> viewAllRequest(int employeeId) {
		// TODO Auto-generated method stub
		System.out.println("In Service");
		return requestDetailsRepositoryInterface.viewAllRequest( employeeId);
	}

	@Override
	public boolean addRequest(RequestDetails requestDetails) {
		// TODO Auto-generated method stub
		return requestDetailsRepositoryInterface.addRequest(requestDetails);
	}

	@Override
	public List<RequestDetails> viewManagerRequest(int employeeId) {
		// TODO Auto-generated method stub
		return requestDetailsRepositoryInterface.viewManagerRequest(employeeId);
	}

	@Override
	public RequestDetails updateRequestStatus(RequestDetails requestDetails) {
		// TODO Auto-generated method stub
		return requestDetailsRepositoryInterface.updateRequestStatus(requestDetails);
	}

//	@Override
//	public List<RequestDetails> viewTravelAgentRequest(String status) {
//		// TODO Auto-generated method stub
//		return requestDetailsRepositoryInterface.viewTravelAgentRequest(status);
//	}
	
	@Override
	public List<RequestDetails> viewTravelAgentRequest() {
		// TODO Auto-generated method stub
		return requestDetailsRepositoryInterface.viewTravelAgentRequest();
	}
	
	@Override
	public boolean validateSlab(int requestId) {
		// TODO Auto-generated method stub
		
		return requestDetailsRepositoryInterface.validateSlab( requestId);
	}

	@Override
	public List<RequestDetails> viewTravelAgentApprovedRequest() {
		// TODO Auto-generated method stub
		return requestDetailsRepositoryInterface.viewTravelAgentApprovedRequest();
	}
	
	
	


}
