package serializationdeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoforSeializationdeserialiation.EmployeeDetailswithObject;

public class SerializationwithObject {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		int[] phone= {123,567};
		Spouse sp=new Spouse("hjk", "microsoft", phone);
		
		//Step1: create 
		EmployeeDetailswithObject ed=new EmployeeDetailswithObject("mana", "hj", "mana@gmail.com", phone,sp );
		
		//Step2: create object of object mapper class
		ObjectMapper onj= new ObjectMapper();
		//Step3: 
		onj.writeValue(new File("./EmpdetailswithObject.json"), ed);
		

	}

}
