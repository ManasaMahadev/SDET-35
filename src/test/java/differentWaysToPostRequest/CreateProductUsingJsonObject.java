package differentWaysToPostRequest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

@Test
public class CreateProductUsingJsonObject {
	
	public void createProduct() {
		Random ran=new Random();
		int random=ran.nextInt(100);
		
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "manasa");
		jobj.put("projectName", "purple hyacinth "+random);
		jobj.put("status", "created");
		jobj.put("teamSize", 12);
		
		given()
		.body(jobj)
		.contentType(ContentType.JSON)
		.when()
		 .post("http://localhost:8084/addProject")
		 .then()
		 .assertThat().statusCode(201).log().all();
	}

}
