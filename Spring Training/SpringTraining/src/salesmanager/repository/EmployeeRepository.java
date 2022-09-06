package salesmanager.repository;

import java.util.List;

import salesmanager.model.Employee;

public interface EmployeeRepository {

	List<Employee> getAlEmployees();

}