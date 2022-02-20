package homeWork.h2;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	
	public Employee(int id, String firstName, String lastName, int salary) {
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.salary=salary;
	}
	public int getId() {
		return id;
	}
//	public void setId(int newId) {
//		id=newId;
//	}
	public String getFirstName() {
		return firstName;
	}
//	public void setFirstName(String newFirstName) {
//		firstName=newFirstName;
//	}
	public String getLastName() {
		return lastName;
	}
//	public void setLastName(String newLastName) {
//		lastName=newLastName;
//	}
	public String getName() {
		return firstName+" "+lastName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int newSalary) {
		salary=newSalary;
	}
	public int getAnnualSalary() {
		return 12*salary;
	}
	public int raiseSalary(int percentage) {
		return salary+percentage*(salary/100);
	}
	public String toString() {
		return "Employee [id=" + id + ", name="+firstName+" "+lastName + ", salary=" +salary+"]";
	}
}
