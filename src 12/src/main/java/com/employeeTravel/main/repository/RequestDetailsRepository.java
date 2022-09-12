package com.employeeTravel.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.employeeTravel.main.domain.DocumentsDetails;
import com.employeeTravel.main.domain.EmployeeDetails;
import com.employeeTravel.main.domain.RequestDetails;

@Repository
public class RequestDetailsRepository implements RequestDetailsRepositoryInterface {

	private final String VIEW_ALL_REQUEST = "select rd.request_id, rd.employee_id, rd.departure_location, rd.destination, rd.mode_of_travel, rd.purpose_of_travelling, rd.departure_date, rd.arrival_date, rd.status, rd.document_id, ed.employee_name, ed.gender, "
			+ "ed.date_of_birth, ed.city, ed.state, ed.country, ed.pincode, ed.email_id, ed.contact_no, ed.designation, ed.reports_to, ed.salary, ed.login_id, ed.slab_id, edoc.ticket_id, edoc.document_name, edoc.document_type, edoc.upload_file from request_details rd ,"
			+ " employee_details ed , employee_documents edoc  where rd.employee_id=? and (rd.employee_id= ed.employee_id and rd.document_id= edoc.document_id)";

	private final String ADD_NEW__REQUEST = "insert into request_details values (request_details_sequence.NEXTVAL,?, ?, ?, ?,?,?,?,?,?)";
	private final String UDPATE_REQUEST_STATUS= "UPDATE request_details SET STATUS=? WHERE request_id=?";
	private final String VIEW_MANAGER_REQUEST = "select * from request_details where employee_id IN(select employee_id from employee_details where REPORTS_TO=(Select employee_id from employee_details where employee_id=?)) and  status='pending'";
	private final String VIEW_TRAVEL_AGENT_REQUEST = "Select * from request_details where status='Approved by manager'";
	private final String VALIDATE_SLAB = "select sd.slab_id, sd.designation, sd.slab_budget, sd.mode_of_travel, rd.request_id, rd.employee_id, rd.departure_location, rd.destination, rd.mode_of_travel, rd.purpose_of_travelling, rd.departure_date, rd. arrival_date, rd.status, rd.document_id from request_details rd join Employee_details ed ON rd.employee_id = ed.employee_id join slab_details sd on ed.slab_id= sd.slab_id where request_id = ? and (sd.mode_of_travel=rd.mode_of_travel)";
	private final String VIEW_TRAVEL_AGENT_APPROVED_REQUEST = "Select * from request_details where status='Approved by Travel Agent'";
	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<RequestDetails> viewAllRequest(int employeeId) {

		System.out.println("In Repository");
		return jdbcTemplate.query(VIEW_ALL_REQUEST, new RequestRowMap(), employeeId);
	}

	@Override
	public RequestDetails updateRequestStatus(RequestDetails requestDetails) {
		jdbcTemplate.update(UDPATE_REQUEST_STATUS, requestDetails.getStatus(),  requestDetails.getRequestId());
		return requestDetails;
	}

	@Override
	public List<RequestDetails> viewManagerRequest(int employeeId) {
		System.out.println("In Repository");
		List<RequestDetails> getGetManagerRequest=jdbcTemplate.query(VIEW_MANAGER_REQUEST, new RequestRowMap(), employeeId);
		System.out.println(getGetManagerRequest);
		return getGetManagerRequest;
	}


	@Override
	public List<RequestDetails> viewTravelAgentRequest() {
			System.out.println("In Repository");
			return jdbcTemplate.query(VIEW_TRAVEL_AGENT_REQUEST, new RequestRowMap());
		}
	


	@Override
	public boolean validateSlab( int requestId) {
		System.out.println(requestId);
		RequestDetails validateSlab = null;
		try {
		 validateSlab = jdbcTemplate.queryForObject(VALIDATE_SLAB, new RequestRowMap(), requestId);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("In Repository");
		System.out.println(validateSlab);
		if (validateSlab == null) {
			return false;
		}
		System.out.println("In Repository");
		return true;
	}
	
	@Override
	public List<RequestDetails> viewTravelAgentApprovedRequest() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(VIEW_TRAVEL_AGENT_APPROVED_REQUEST, new RequestRowMap());
	}	




	
	
	@Override
	public boolean addRequest(RequestDetails requestDetails) {
		Object[] params = { requestDetails.getEmployeeDetails().getEmployeeId(), requestDetails.getDepartureLocation(),
				requestDetails.getDestination(), requestDetails.getModeOfTravel(),
				requestDetails.getPurposeOfTravelling(), requestDetails.getDepartureDate(),
				requestDetails.getArrivalDate(), requestDetails.getStatus(),
				requestDetails.getDocumentsDetails().getDocumentId() };
		int result = jdbcTemplate.update(ADD_NEW__REQUEST, params);
		if (result > 0)
			return true;
		return false;
	}

	public class RequestRowMap implements RowMapper<RequestDetails> {

		@Override
		public RequestDetails mapRow(ResultSet rs, int rowNum) throws SQLException {

			int requestId = rs.getInt("request_id");
			String departureLocation = rs.getString("departure_location");
			String destination = rs.getString("destination");
			String modeOfTravel = rs.getString("mode_of_travel");
			String purposeOfTravelling = rs.getString("purpose_of_travelling");
			LocalDate departureDate = rs.getDate("departure_date").toLocalDate();
			LocalDate arrivalDate = rs.getDate("arrival_date").toLocalDate();
			String status = rs.getString("status");

			EmployeeDetails employeeDetails = new EmployeeDetails();
			employeeDetails.setEmployeeId(rs.getInt("employee_id"));

			DocumentsDetails documentsDetails = new DocumentsDetails();
			documentsDetails.setDocumentId(rs.getInt("document_id"));

			RequestDetails requestDetails = new RequestDetails(requestId, employeeDetails, departureLocation,
					destination, modeOfTravel, purposeOfTravelling, departureDate, arrivalDate, status,
					documentsDetails);

			return requestDetails;
		}

	}



}
