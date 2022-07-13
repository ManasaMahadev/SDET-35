package differentWaysToPostRequest;

import static io.restassured.RestAssured.*;

import java.io.File;

import io.restassured.http.ContentType;

public class CreateProjectUsingJsonFile {
	
	public void createProject() {
		baseURI="http://localhost";
		port=8084;
		//create data
		File file=new File(".\\testdata\\data.json");
		//send the request
		given()
		 .body(file)
		 .contentType(ContentType.JSON)
		.when()
		 .post("/addProject")
		.then().log().all();
		
	}

}
