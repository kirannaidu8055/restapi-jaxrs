package com.kiran.restfulws;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.kiran.restfulws.model.Employee;

@Path("/employeeservice")
public interface EmployeeService {
	
	@Path("/employees")
	@GET
	List<Employee> getEmployees();
	
	@Path("/employees/{id}")
	@GET
	Employee getEmployee(@PathParam(value = "id") long id);

}
