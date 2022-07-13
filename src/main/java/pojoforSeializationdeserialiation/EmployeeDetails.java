package pojoforSeializationdeserialiation;
/**
 * 
 * @author Manasa
 *
 */
public class EmployeeDetails {
	
	//Step 1: Declare all the necessary variables as global
	String Empname;
	String Empid;
	String Email;
	int Phno;
	String Designation;
	
	//Step 2: Create a constructor to initialize these variables
	public EmployeeDetails(String empname, String empid, String email, int phno, String designation) {
		super();
		Empname = empname;
		Empid = empid;
		Email = email;
		Phno = phno;
		Designation = designation;
	}
	//create an empty constructor for deserialisation
	public EmployeeDetails()
	{
		
	}
	//Step 3: Provide getters and setters to access these variables
	public String getEmpname() {
		return Empname;
	}
	public void setEmpname(String empname) {
		Empname = empname;
	}
	public String getEmpid() {
		return Empid;
	}
	public void setEmpid(String empid) {
		Empid = empid;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getPhno() {
		return Phno;
	}
	public void setPhno(int phno) {
		Phno = phno;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}


	}

