package Day1;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

import org.hamcrest.Matchers;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;



import static io.restassured.matcher.RestAssuredMatchers.*;


public class DifferentPostRequest {

	//@Test
	void hashmapPost()
	{
	HashMap data= new HashMap();
	
	data.put("name", "Shiva");
	data.put("job", "trainer");

	given()
	.contentType("application/json")
	.body(data)
	.when()
			.post("https://reqres.in/api/users")
	.then()
	.statusCode(201)
	.body("name",Matchers.equalTo("Shiva"))
	.log().all();
	}
	//@Test
	void jsonorgPost()
	{
		JSONObject js= new JSONObject();
		js.put("name", "Shiva");
		js.put("job", "trainer");
		given()
		.contentType("application/json")
		.body(js.toString())
		.when()
				.post("https://reqres.in/api/users")
		.then()
		.statusCode(201)
		.body("name",Matchers.equalTo("Shiva"))
		.log().all();
	}
	
	//@Test
	void pojoPost()
	{
		PojoRequest po= new PojoRequest();
		po.setJob("trainer");
		po.setName("Shiva");
		
		given()
		.contentType("application/json")
		.body(po)
		.when()
				.post("https://reqres.in/api/users")
		.then()
		.statusCode(201)
		.body("name",Matchers.equalTo("Shiva"))
		.log().all();
		
	
	}
	
	@Test
	void externalJson() throws FileNotFoundException
	{
		File f= new File("C:\\Users\\user\\eclipse-workspace\\MyRestAussuredTesting\\target\\body.json");
		FileReader fr= new FileReader(f);
		JSONTokener jt= new JSONTokener(fr);
		JSONObject data= new JSONObject(jt);
		given()
		.contentType("application/json")
		.body(data.toString())
		.when()
				.post("https://reqres.in/api/users")
		.then()
		.statusCode(201)
		.body("name",Matchers.equalTo("Shiva"))
		.log().all();
		
	}
	
	
}
