package pojoforSeializationdeserialiation;

public class EmployeeDetailsWithArray {

	//step1: Declare all variables as global
	String Name;
	String Id;
	String[] Email;
	String Designation;
	int[] Phno;
	
	//Step2:Declare the constructor to initialize the variable
	public EmployeeDetailsWithArray(String name, String id, String[] email, String designation, int[] phno) {
		super();
		Name = name;
		Id = id;
		Email = email;
		Designation = designation;
		Phno = phno;
	}
	
	//create a empty constructor
	public EmployeeDetailsWithArray()
	{
		
	}

	
	//step3:Provide getters and setters
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String[] getEmail() {
		return Email;
	}

	public void setEmail(String[] email) {
		Email = email;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public int[] getPhno() {
		return Phno;
	}

	public void setPhno(int[] phno) {
		Phno = phno;
	}
	
	
}
