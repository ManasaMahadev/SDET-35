package pojoforSeializationdeserialiation;

public class EmployeeDetailswithObject {

	//Step1: declare variables globally
	String name;
	String empid;
	String Designation;
	int[] phno;
	Object spouse;
	
	//step2: declare constructor
	public EmployeeDetailswithObject(String name, String empid, String designation, int[] phno, Object spouse) {
		super();
		this.name = name;
		this.empid = empid;
		Designation = designation;
		this.phno = phno;
		this.spouse = spouse;
	}
	
	//create empty constructor
	public EmployeeDetailswithObject() {
		
	}
	
	//step3: provide getters and setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public int[] getPhno() {
		return phno;
	}

	public void setPhno(int[] phno) {
		this.phno = phno;
	}

	public Object getSpouse() {
		return spouse;
	}

	public void setSpouse(Object spouse) {
		this.spouse = spouse;
	}
	

	

}
