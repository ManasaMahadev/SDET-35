package CreateClasswithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class DeleteProject {
	@Test
	public void deleteproject() {
		//step1: create the required data
		//step2: send the request
		Response resp = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_1202");
		//step3: validate the response
		ValidatableResponse validate = resp.then();
		validate.log().all();
		
	}

}
