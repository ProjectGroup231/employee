package com.project.employee.serviceImpl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.employee.Service.EmployeeService;
import com.project.employee.domain.EmployeeDomain;
import com.project.employee.entities.Employee;
import com.project.employee.model.EmployeeModel;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired	
	private EmployeeDomain empDomain;

	@Override
	public String addEmployee(EmployeeModel employeemodel) {
		String result = empDomain.addEmployee(employeemodel);
		return result;

	}

	@Override
	public Employee deleteEmployee(UUID id) {
		 Employee employee1 = empDomain.deleteEmployee(id);
		return  employee1;
	}

	

}
