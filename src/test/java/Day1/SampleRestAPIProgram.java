package Day1;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

import java.util.HashMap;

import static io.restassured.matcher.RestAssuredMatchers.*;
public class SampleRestAPIProgram {

	int id;
	
	@Test(priority=1)
		void getUserDetails()
		{
			given()
			
			.when()
			.get("https://reqres.in/api/users?page=2")
			
			.then()
			.statusCode(200)
			.body("page",Matchers.equalTo(2))
			.log().all();
		}

@Test(priority=2)
	     
		void postUserDetails()
	     {
	HashMap data= new HashMap();
			data.put("name", "Pawan");
			data.put("job", "trainer");
					
		   id= given()
		    .contentType("Application/json")
		    .body(data)
			.when()
			.post("https://reqres.in/api/users").jsonPath().getInt("id");
			/*.then()
			.statusCode(201)
		    .log().all();*/
	    	 
	     }
@Test(priority=3, dependsOnMethods= {"postUserDetails"})
          void updateUserDetails()
         {
	HashMap data= new HashMap();
	      data.put("name","shiva");
			data.put("job", "trainer");
	      given()
	      
	      .contentType("Application/json")
		    .body(data)
			.when()
			.put("https://reqres.in/api/users/"+id)
			.then()
			.statusCode(200)
			.log().all();
         }

@Test (priority=4, dependsOnMethods=("postUserDetails"))
void delateUserDetails()
{

 given()
 
 
	.when()
	.delete("https://reqres.in/api/users/"+id)
	.then()
	.statusCode(204)
	.log().all();
}
	}



