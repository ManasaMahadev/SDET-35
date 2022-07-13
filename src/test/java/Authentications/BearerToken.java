package Authentications;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class BearerToken {
@Test
	public void bearerToken() {
		 baseURI="https://api.github.com";
		 JSONObject jobj=new JSONObject();
		 jobj.put("name", "SDET-35");
		 jobj.put("description", "RestFulWeb Services FW tested");
		 
		 given()
		  .auth()
		  .oauth2("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")
		  .body(jobj)
		  .contentType(ContentType.JSON)
		  .when()
		  .post("/user/repos")
		  .then().assertThat().statusCode(201).log().all();
	}
}
