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
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.matcher.RestAssuredMatchers.*;
public class ResponseValidation {
//@Test
	void validationUsingThen()
	{
		given()
		.when()
		.get("https://reqres.in/api/users?page=2")
		.then()
		.statusCode(200)
		.body("data[2].first_name", Matchers.equalTo("Tobias"))
		.log().all();
	}
//@Test
void validationUsingResponse()
{
	
	Response res=given()
	.when()
	.get("https://reqres.in/api/users?page=2");
	Assert.assertEquals(res.jsonPath().get("data[2].first_name"), "Tobias");
	
}
@Test
void validationUsingJsonObject()
{
	Response res=given()
	.when()
	.get("https://reqres.in/api/users?page=2");
	JSONObject jo=new JSONObject(res.asString());
	System.out.println("FirstName List");
	for (int i=0;i<jo.getJSONArray("data").length();i++)
	{
	String name=jo.getJSONArray("data").getJSONObject(i).get("first_name").toString();
	System.out.println(name);
	}
}
@Test

	
void vaidationUsingJsonArray()
{
	Response res=given()
	.when()
	.get("https://fake-json-api.mock.beeceptor.com/users");
	res.print();
	JSONArray jr= new JSONArray(res.asString());
	int user_count=jr.length();
	System.out.println(user_count);
	
	
	
}


}

