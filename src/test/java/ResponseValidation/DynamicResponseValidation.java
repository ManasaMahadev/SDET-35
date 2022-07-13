package ResponseValidation;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.List;

@Test
public class DynamicResponseValidation {
	
	public void dynamicresponse() {
		
		baseURI="http://localhost";
		port=8084;
		String expData="TY_PROJ_1203";
		//send request
		Response resp = when().get("/projects");
		//validate response
		Boolean flag=false;
		List<String> list = resp.jsonPath().get("projectId");
		for(String s:list)
		{
			if(s.equalsIgnoreCase(expData)) {
		
				flag=true;
				break;
			}
			}
		Assert.assertTrue(flag);
		}

}
