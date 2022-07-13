package CRUDOperationwithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

@Test
public class PracticeBDD {
	
	public void createpoj() {
	
	when()
	 .delete("http://localhost:8084/projects/TY_PROJ_1405")
	.then()
	 .log().all();
	}

}
