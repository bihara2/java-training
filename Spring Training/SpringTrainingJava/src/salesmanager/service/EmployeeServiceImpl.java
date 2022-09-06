package salesmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import salesmanager.model.Employee;
import salesmanager.repository.EmployeeRepository;
import salesmanager.repository.HibernateEmployeeRepositoryImpl;

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		System.out.println("Overloaded Constructor called");
		this.employeeRepository = employeeRepository;
	}

	public EmployeeServiceImpl() {
		System.out.println("Default Constructor called");
	}

	public EmployeeRepository getEmployeeRepository() {
		return this.employeeRepository;
	}

	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		System.out.println("Setter executed");
		this.employeeRepository = employeeRepository;
	}

	public List<Employee> getAllEmployees() {
		return employeeRepository.getAlEmployees();
	}

}
