package differentWaysToPostRequest;

import org.testng.annotations.Test;

import ProjectLibrary.Projectlibrary;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

@Test
public class CreateProjectusingPOJO {
	
	public void createProject() {
	    Random ran=new Random();
	    int random = ran.nextInt(100);
	    baseURI="http://localhost";
	    port=8084;
		Projectlibrary plib=new Projectlibrary("manasa", "DailyJOJO"+random, "created", 12);
		given()
		.body(plib)
		.contentType(ContentType.JSON)
	    .when()
	     .post("/addProject")
	    .then()
	     .log().all();
	}

}
