package CRUDOperationwithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

@Test
public class UpdateProject {
	
	public void updateProject() {
		//step1: create required date
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "anu");
		jobj.put("peojectName", "purple hyacinth 93");
		jobj.put("status", "created");
		jobj.put("teamSize", 12);
		
		//step2: send the request
		given()
		 .body(jobj)
		 .contentType(ContentType.JSON)
		.when()
		 .get("http://localhost:8084/projects/TY_PROJ_1203")
		.then()
		 .assertThat().statusCode(200).log().all();
		
	}

}
