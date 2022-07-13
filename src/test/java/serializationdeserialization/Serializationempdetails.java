package serializationdeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoforSeializationdeserialiation.EmployeeDetails;

public class Serializationempdetails {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
		//step 1: create object of pojo class and initialise
		EmployeeDetails emp=new EmployeeDetails("Manasa","ty123","manasa@ty.com",123,"SDET");
		
		//step 2: Create object of object mapper class
		ObjectMapper obj=new ObjectMapper();
		
		//step 3: from object mapper call the method writeValue()
		obj.writeValue(new File("./EmpDetails.json"), emp);

	}

}
