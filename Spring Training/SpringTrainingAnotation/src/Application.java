import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import salesmanager.model.Employee;
import salesmanager.service.EmployeeService;
import salesmanager.service.EmployeeServiceImpl;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		EmployeeService employeeService = applicationContext.getBean("employeeService", EmployeeService.class);
		List<Employee> employees = employeeService.getAllEmployees();

		for (Employee employee : employees) {
			System.out.println(employee.getEmployeeName() + " at " + employee.getEmployeeLocation());
		}

	}

}