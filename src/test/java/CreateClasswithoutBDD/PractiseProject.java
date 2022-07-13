package CreateClasswithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

@Test
public class PractiseProject {
	
	public void Prcitse() {
		
		Response resp = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_1404");
		ValidatableResponse vali = resp.then();
		vali.log().all();
		
		
	}

}
