package model;
/*
 * This is Spring Standard Beans.
 * containing Variables , Constructor ,Getter Setter 
 * */
public class Employee {
	private int id;
	private String emp_name;
	private int salary;
	
	Employee(){
		
	}
	
	public Employee(int id, String emp_name, int salary) {
		super();
		this.id = id;
		this.emp_name = emp_name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", emp_name=" + emp_name + ", salary=" + salary + "]";
	}

	
}
