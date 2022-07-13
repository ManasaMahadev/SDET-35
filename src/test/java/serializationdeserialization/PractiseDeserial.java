package serializationdeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoforSeializationdeserialiation.Practise;

public class PractiseDeserial {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper obj=new ObjectMapper();
		Practise sm = obj.readValue(new File(".\\Prctisefile.json"),Practise.class);
		System.out.println(sm.getSpouse());
		

	}

}
