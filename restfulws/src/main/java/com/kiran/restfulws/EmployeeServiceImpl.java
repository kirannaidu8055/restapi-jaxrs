package com.kiran.restfulws;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.kiran.restfulws.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	Map<Long, Employee> employees = new HashMap<>();
	long liveId1 = 1000l;
	long liveId2 = 1001l;

	public EmployeeServiceImpl() {
		init();
	}

	void init() {
		Employee employee1 = new Employee();
		employee1.setId(liveId1);
		employee1.setName("Adam");
		employees.put(employee1.getId(), employee1);
		
		Employee employee2 = new Employee();
		employee2.setId(liveId2);
		employee2.setName("Samson");
		employees.put(employee2.getId(), employee2);
	}

	@Override
	public List<Employee> getEmployees() {
		Collection<Employee> output = employees.values();
		List<Employee> result = new ArrayList<>(output);
		return result;
	}

	@Override
	public Employee getEmployee(long id) {
		return employees.get(id);
	}

}
