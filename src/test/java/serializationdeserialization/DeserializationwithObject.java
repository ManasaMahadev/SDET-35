package serializationdeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoforSeializationdeserialiation.EmployeeDetailswithObject;

public class DeserializationwithObject {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		//Step1:  create object for objectMapper
		ObjectMapper obj= new ObjectMapper();
		//Step2:use the readVAlue method and store in the variable
		EmployeeDetailswithObject ap = obj.readValue(new File(".\\EmpdetailswithObject.json"), EmployeeDetailswithObject.class);
		//step3:using getters and setters access the variable
		System.out.println(ap.getSpouse());
		System.out.println(ap.getPhno()[0]);

	}

}
