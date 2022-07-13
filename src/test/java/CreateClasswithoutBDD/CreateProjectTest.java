package CreateClasswithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateProjectTest {
	@Test
	public void createProject() {
		//Step1: create required data
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy","manasa");
		jobj.put("projectName","manas1");
		jobj.put("status","created");
		jobj.put("teamSize",12);
		
		//Step2: send the request
		RequestSpecification req = RestAssured.given();
		req.body(jobj);
		req.contentType(ContentType.JSON);
		Response resp = req.post("http://localhost:8084/addProject");
		
		//step3: validate the response
		System.out.println(resp.prettyPeek());
		System.out.println(resp.getStatusCode());
		System.out.println(resp.getTime());
		
		ValidatableResponse validate = resp.then();
		validate.log().all();


	}
}