package salesmanager.repository;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import salesmanager.model.*;

@Repository("employeeRepository")
public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {
	
	public List <Employee> getAlEmployees(){
		
		List<Employee> employees= new ArrayList<>();
		
		Employee employee= new Employee();
		employee.setEmployeeName("Bihara");
		employee.setEmployeeLocation("Hanwella");
		
		employees.add(employee);
		
		return employees;
		
	}

}
