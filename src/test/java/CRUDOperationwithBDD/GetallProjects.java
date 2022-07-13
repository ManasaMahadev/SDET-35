package CRUDOperationwithBDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

@Test
public class GetallProjects {
	
	public void getallprojects() {
		when()
		 .get("http://localhost:8084/projects")
		.then()
		 .assertThat().statusCode(200).log().all();
	}

}
