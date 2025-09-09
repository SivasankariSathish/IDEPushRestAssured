package Day1;
import static io.restassured.RestAssured.given;

import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import jdk.internal.net.http.common.Log;

public class MyHeadersClass {
	@Test
	void myHeader()
	{
	
			Response res=given()
	
			.when()
			.get("https://google.com");
		Headers hd=res.getHeaders();
		for(Header h: hd)
		{
		System.out.println(h.getName()+"/t"+h.getValue());
	}
	}

}
