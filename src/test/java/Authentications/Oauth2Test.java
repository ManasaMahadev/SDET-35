package Authentications;

import static io.restassured.RestAssured.*;

import org.testng.Reporter;
import org.testng.annotations.Test;

import io.restassured.response.Response;
@Test
public class Oauth2Test {
	
	public void oauth2test() {
		baseURI="http://coop.apps.symfonycasts.com";
		//Step1: create a post request with client id and client secret
		Response resp = given()
						.formParam("client_id", "Malifice")
						.formParam("client_secret", "8dbfb746284a8d672c922360c19cbfaf")
						.formParam("grant_type", "client_credentials")
						.formParam("redirect_uri", "http://manasa.com")
						.formParam("code", "authorization_code only")
						.when()
						.post("/token");
		//Step2: capture access token in response
		String token = resp.jsonPath().get("access_token");
		Reporter.log(token,true);
		//Step3: use that access token & access any of the APi's
		given()
		 .auth().oauth2(token)
		 .pathParam("USER_ID", 3540)
		 .when()
		 .post("/api/{USER_ID}/barn-unlock")
		 .then().log().all();
	}

}
