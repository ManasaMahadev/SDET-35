package serializationdeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoforSeializationdeserialiation.EmployeeDetails;

public class Deserializationempdetails {
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
	
	//Step 1:create object for object mapper
	ObjectMapper obj=new ObjectMapper();
	
	//step2: call the readVAlue method and store in the variable
	EmployeeDetails e1=obj.readValue(new File(".\\EmpDetails.json"), EmployeeDetails.class);
	
	//step 3: using getters and setters access the variable
    System.out.println(e1.getEmpname());
    System.out.println(e1.getEmail());
    System.out.println(e1.getDesignation());


}

}
