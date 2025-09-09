package Day1;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

import org.testng.annotations.Test;

import static io.restassured.matcher.RestAssuredMatchers.*;
public class PathQueryAPI {
	@Test
	void parameterAPI()
	{
		given()
		.contentType("application/json")
		.pathParam("mypath1", "api")
		.pathParam("mypath2","users")
		.queryParam("page", 2)
		.queryParam("id", 5)
		.when()
		//https://reqres.in/api/users?page=2&id=5
		.get("https://reqres.in/{mypath1}/{mypath2}")
		.then()
		.statusCode(200)
		.log().all();
	}

}
