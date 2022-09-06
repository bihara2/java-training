package salesmanager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import salesmanager.repository.EmployeeRepository;
import salesmanager.repository.HibernateEmployeeRepositoryImpl;
import salesmanager.service.EmployeeService;
import salesmanager.service.EmployeeServiceImpl;

@Configuration
public class ApplicationConfiguration {

	@Bean(name = "employeeService")
	public EmployeeService getEmployeeService() {
		
		EmployeeServiceImpl employeeService = new EmployeeServiceImpl(getEmployeeRepository());
		return employeeService;
	}

	@Bean(name = "employeeRepository")
	public EmployeeRepository getEmployeeRepository() {
		return new HibernateEmployeeRepositoryImpl();
	}

}
