package Day2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderCheck {

	@Test(dataProvider="dp",priority=1,dependsOnMethods= {})
	void printingData(String username,String password,String email)
	{
		System.out.println(username+"\t"+password+"\t"+email);
	}

@DataProvider(name="dp",indices= {0,2})
public Object[][] testData() {
  
    Object data[][]=   { {"user1", "password1","email"},
                        {"user2", "password2","email"},
                         {"user3", "password3","email"},
                       };
return data;
  
}

	

}

