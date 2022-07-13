package differentWaysToPostRequest;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

@Test
public class CreateObjectUsingHashmap {
	
	public void createoproduct() {
		baseURI="http://localhost";
		port=8084;
		//create date
		HashMap map=new HashMap();
		map.put("createdBy", "manasa");
		map.put("projectName", "purple hyacinth 0");
		map.put("status", "created");
		map.put("teamSize", 12);
		
		//send request
		given()
		 .body(map)
		 .contentType(ContentType.JSON)
		.when()
		 .post("/addProject")
		.then()
		 .assertThat().statusCode(201).log().all();
				
				
				
				
	}

}
