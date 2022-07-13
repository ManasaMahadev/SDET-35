package RequestChaining;

import static io.restassured.RestAssured.*;

import java.util.Random;

import org.testng.Reporter;
import org.testng.annotations.Test;

import ProjectLibrary.Projectlibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
@Test
public class CreatenSelectNDeleteProject {
	public void createslectdeete() {
		Random ran=new Random();
		int rannum=ran.nextInt(100);
		baseURI="http://localhost";
		port=8084;
		Projectlibrary plib=new Projectlibrary("manasa", "push"+rannum, "open", 10);
		Response resp = given().body(plib).contentType(ContentType.JSON).when().post("/addProject");
		String pid = resp.jsonPath().get("projectId");
		Reporter.log(pid, true);
		given()
		.pathParam("proid", pid)
		.get("/projects/{proid}")
		.then().log().all();
		given()
		.pathParam("ppid", pid)
		.when().delete("/projects/{ppid}")
		.then().assertThat().statusCode(204).log().all();
		
		
		
	}

}
