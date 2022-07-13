package ResponseValidation;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

@Test
public class ResponseTime {
	
	public void responseTime() {
		baseURI="http://localhost";
		port=8084;
		Response resp = when().get("/projects");
		resp.then().assertThat().time(Matchers.lessThan(900L), TimeUnit.MILLISECONDS);
		System.out.println(resp.getTime());
	}

}
