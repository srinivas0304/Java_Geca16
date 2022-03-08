package Interface;

public class Employee {
	String name;
	String eID;
	double sal;
	public Employee(String name, String eID, double sal) {
		super();
		this.name = name;
		this.eID = eID;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", eID=" + eID + ", sal=" + sal + "]";
	}
	
	

}
