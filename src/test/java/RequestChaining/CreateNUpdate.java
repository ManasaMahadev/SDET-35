package RequestChaining;

import static io.restassured.RestAssured.*;

import java.util.Random;

import org.testng.Reporter;
import org.testng.annotations.Test;

import ProjectLibrary.Projectlibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
@Test
public class CreateNUpdate {
public void createupdate() {
	Random ran=new Random();
	int ranum = ran.nextInt(100);
	baseURI="http://localhost";
	port=8084;
	Projectlibrary plib=new Projectlibrary("Mansa", "kimai"+ranum, "open", 20);
	Response resp = given().body(plib).contentType(ContentType.JSON).when().post("/addProject");
	String pid = resp.jsonPath().get("projectId");
	Reporter.log(pid,true);
	Projectlibrary plib2=new Projectlibrary("anusha", "kimai"+ranum, "open", 20);
	given().body(plib2).contentType(ContentType.JSON)
	.pathParam("proid", pid)
	.when().put("/projects/{proid}")
	.then().assertThat().statusCode(200).log().all();
}
}
