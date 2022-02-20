package Visitor;

import java.util.LinkedList;
import java.util.List;

public class BusinessReport {
	 private List<Employee> employees = new LinkedList<Employee>();

	    public BusinessReport() {
	        employees.add(new Manager("Manager-A"));
	        employees.add(new Engineer("Engineer-A"));
	        employees.add(new Engineer("Engineer-B"));
	        employees.add(new Engineer("Engineer-C"));
	        employees.add(new Manager("Manager-B"));
	        employees.add(new Engineer("Engineer-D"));
	    }

	    public void showReport(IVisitor visitor){
	        for (Employee employee: employees) {
	            employee.accept(visitor);
	        }
	    }
}
