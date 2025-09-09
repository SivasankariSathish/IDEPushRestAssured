package Day1;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.matcher.RestAssuredMatchers.*;

public class CookiesDemo {
	@Test
	void cookieees()
	{
	
			Response res=given()
	
			.when()
			.get("https://google.com");
			
		Map<String,String>	co= res.getCookies();
		for(String k:co.keySet())
		{
			System.out.println(k+"\t"+res.getCookie(k) );
			
		}
			
	}
}
