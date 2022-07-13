package CreateClasswithoutBDD;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetAllProjects {

	public void getallprojects() {
		//step1: create required data
		//step2:send the request
		Response resp = RestAssured.get("http://localhost:8084/projects");
		//step3: validate the response
		ValidatableResponse validate = resp.then();
		validate.log().all();
		validate.assertThat().statusCode(200);
		
		
	}

}
