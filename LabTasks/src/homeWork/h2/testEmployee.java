package homeWork.h2;

public class testEmployee {

	public static void main(String[] args) {
		Employee employee = new Employee(64, "Zeeshan", "Ahmad", 50000);
		System.out.println(employee.getName());
		System.out.println(employee);
		employee.setSalary(60000);
		System.out.println(employee);
		employee.setSalary(employee.raiseSalary(20));
		System.out.println(employee);
		
	}

}
