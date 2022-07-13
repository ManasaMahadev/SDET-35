package DataDrivenTesting;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ProjectLibrary.Projectlibrary;
import io.restassured.http.ContentType;

public class usingObjectarr {
	
	@DataProvider(name="dataforpost")
	public Object[][] dataforProject(){
		Object[][] objarr= new Object[5][4];
		objarr[0][0]="manasa";
		objarr[0][1]="topaz";
		objarr[0][2]="open";
		objarr[0][3]=10;
		
		objarr[1][0]="anusha";
		objarr[1][1]="emarald";
		objarr[1][2]="created";
		objarr[1][3]=20;
		
		objarr[2][0]="pushpa";
		objarr[2][1]="sapphire";
		objarr[2][2]="close";
		objarr[2][3]=15;
		
		objarr[3][0]="mahadev";
		objarr[3][1]="pearl";
		objarr[3][2]="ongoing";
		objarr[3][3]=20;
		
		objarr[4][0]="sonu";
		objarr[4][1]="ruby";
		objarr[4][2]="closed";
		objarr[4][3]=25;
		
		return objarr;
			
	}
	
	@Test(dataProvider = "dataforpost")
	public void useDataProvider(String createdBy,String projectName,String status,int teamSize) {
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", createdBy);
		jobj.put("projectName", projectName);
		jobj.put("status", status);
		jobj.put("teamSize", teamSize);
		baseURI="http://localhost";
		port=8084;
		given()
		.body(jobj)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then().assertThat().statusCode(201).log().all();
		
	}
	

}
