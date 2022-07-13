package CRUDOperationwithBDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

@Test
public class Deleteproject {
	public void deleteproject() {
		when()
		 .delete("http://localhost:8084/projects/TY_PROJ_611")
		.then()
		 .assertThat().statusCode(204).log().all();
	}

}
