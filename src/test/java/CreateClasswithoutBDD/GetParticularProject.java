package CreateClasswithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetParticularProject {
	@Test
	public void getparticularProject() {
		//step1:create the required date
		//Step2:send the request
		Response resp = RestAssured.get("http://localhost:8084/projects/TY_PROJ_1003");
		//step3: validate the response
		ValidatableResponse validate = resp.then();
		validate.log().all();
	}

}
