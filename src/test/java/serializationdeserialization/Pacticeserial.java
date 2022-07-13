package serializationdeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoforSeializationdeserialiation.Practise;

public class Pacticeserial {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		String[] mai= {"mana@gmail.com","mana@yahoo.com"};
		PrcatiseSpouse sp=new PrcatiseSpouse("sonu", "microsoft");
		Practise p=new Practise("mana", "ty1234", mai, sp);
		ObjectMapper obj=new ObjectMapper();
		obj.writeValue(new File("./Prctisefile.json"), p);

	}

}
