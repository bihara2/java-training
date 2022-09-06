package salesmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import salesmanager.model.Employee;
import salesmanager.repository.EmployeeRepository;
import salesmanager.repository.HibernateEmployeeRepositoryImpl;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl() {		//if autowire byname or bytype should have constructor with no arguments
		System.out.println("Default Constructor called");
	}

	@Autowired
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {		
		System.out.println("Overloaded Constructor called");
		this.employeeRepository = employeeRepository;
	}

	public EmployeeRepository getEmployeeRepository() {
		return this.employeeRepository;
	}
	
	@Autowired
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		System.out.println("Setter injection called");
		this.employeeRepository = employeeRepository;
	}

	public List<Employee> getAllEmployees() {
		return employeeRepository.getAlEmployees();
	}

}
