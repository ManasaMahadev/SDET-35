package DataDrivenTesting;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;;
@Test
public class PathParam {
	public void pathparam() {
		baseURI="http://localhost";
		port=8084;
		given()
		 .pathParam("pid", "TY_PROJ_804")
		.when()
		 .get("/projects/{pid}")
		 .then().log().all();
		
	}

}
