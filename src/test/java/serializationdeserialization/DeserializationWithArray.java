package serializationdeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoforSeializationdeserialiation.EmployeeDetailsWithArray;

public class DeserializationWithArray {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		//Step1: create object for objectMapper
		ObjectMapper obj= new ObjectMapper();
		//step2: call the readVAlue method and store in the variable
		EmployeeDetailsWithArray eg=obj.readValue(new File(".\\EmpdetailswithArray.json"), EmployeeDetailsWithArray.class);
		//step 3: using getters and setters access the variable
		  System.out.println(eg.getPhno()[1]);
		  System.out.println(eg.getName());
		  System.out.println(eg.getEmail()[0]);

	}

}
