package DataDrivenTesting;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
@Test
public class QueryParam {
	public void queryparam() {
		baseURI="https://reqres.in";
		given()
		 .queryParams("page", 2)
		.when()
		 .get("/api/users")
		.then().log().all();
	}

}
