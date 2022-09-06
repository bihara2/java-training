package salesmanager.service;

import java.util.List;

import salesmanager.model.Employee;
import salesmanager.repository.EmployeeRepository;
import salesmanager.repository.HibernateEmployeeRepositoryImpl;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl() {		//if autowire byname or bytype should have constructor with no arguments
		
	}

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {		
		this.employeeRepository = employeeRepository;
	}

	public EmployeeRepository getEmployeeRepository() {
		return this.employeeRepository;
	}

	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	public List<Employee> getAllEmployees() {
		return employeeRepository.getAlEmployees();
	}

}
