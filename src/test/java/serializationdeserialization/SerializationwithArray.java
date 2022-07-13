package serializationdeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;


import pojoforSeializationdeserialiation.EmployeeDetailsWithArray;

public class SerializationwithArray {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		String[] mailid= {"man@gmail.com","man@ty.com"};
		int[] phone= {1234,5678};
		
		//Step1: create object of pojo class
		EmployeeDetailsWithArray ed=new EmployeeDetailsWithArray("Manasa","ty123",mailid,"sdet",phone);
		
		//step2: create object of object mapper
		ObjectMapper obj=new ObjectMapper();
		
		//step3: 
		obj.writeValue(new File("./EmpdetailswithArray.json"), ed);
	}

}
