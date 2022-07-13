package RequestChaining;

import org.codehaus.jackson.map.ObjectMapper;
import org.testng.Reporter;
import org.testng.annotations.Test;

import ProjectLibrary.Projectlibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.Random;
@Test
public class CreateProjectNdGet {
	public void createPro() {
		Random ran=new Random();
	    int random = ran.nextInt(100);
	    baseURI="http://localhost";
	    port=8084;
		Projectlibrary plib=new Projectlibrary("manasa", "DailyJOJO"+random, "created", 12);
		//step1: create a post request & capture the response
		Response resp=given()
		.body(plib)
		.contentType(ContentType.JSON)
	    .when()
	     .post("/addProject");
		//Step2: using json path retrieve projectID from response 
		String pid = resp.jsonPath().get("projectId");
		Reporter.log(pid,true);
		//System.out.println(pid);
		//step3: use this projectID for another request
	    
		given()
		 .pathParam("proid", pid)
		.when()
		 .get("/projects/{proid}")
		.then().assertThat().statusCode(200).log().all();
}}
