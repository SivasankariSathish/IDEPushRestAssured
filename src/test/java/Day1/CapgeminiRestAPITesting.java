package Day1;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

import org.hamcrest.Matchers;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.matcher.RestAssuredMatchers.*;
public class CapgeminiRestAPITesting {

	@Test(enabled=false)
	void postCapgeminiRequest() throws FileNotFoundException
	{
		File f= new File("C:\\Users\\user\\eclipse-workspace\\MyRestAussuredTesting\\target\\body.json");
		FileReader fr= new FileReader(f);
		JSONTokener jt= new JSONTokener(fr);
		JSONObject data= new JSONObject(jt);
		Response res=given()
		.contentType("application/json")
		.body(data.toString())
		.when()
		.post("https://api.restful-api.dev/objects");
	Assert.assertEquals(res.getStatusCode(),200);
	JSONObject js=new JSONObject(res.asString());
	String year=js.getJSONObject("data").get("year").toString();
	
	Assert.assertEquals(year, "2019");
	
	}
	
	@Test
	void getCapgeminiRequest()
	{
		Response res=given().when()
		.get("https://api.restful-api.dev/objects");
		Assert.assertEquals(res.getStatusCode(),200);
		JSONArray jr= new JSONArray(res.asString());
		String id=jr.getJSONObject(0).get("id").toString();
		Assert.assertEquals(id, "1");
		
	}
	
	}


