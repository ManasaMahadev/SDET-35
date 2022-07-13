package CRUDOperationwithBDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

@Test
public class GetparticularProject {

	public void getparticularproject() {
		when()
		 .get("http://localhost:8084/projects/TY_PROJ_611")
		.then()
		 .assertThat().statusCode(200).log().all();
	}
}
