package CreateClasswithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class UpdateProjectTest {
	@Test
	public void updateProject() {
		//step1: create Json object
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy","anu");
		jobj.put("projectName","mana");
		jobj.put("status","created");
		jobj.put("teamSize",12);
		
		//step2: send the request
		RequestSpecification req = RestAssured.given();
		req.body(jobj);
		req.contentType(ContentType.JSON);
		Response resp = req.put("http://localhost:8084/projects/TY_PROJ_1003");
		
		//step3: validate the response
		ValidatableResponse validate = resp.then();
		validate.log().all();
	}

}
