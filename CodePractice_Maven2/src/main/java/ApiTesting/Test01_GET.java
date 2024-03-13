package ApiTesting;

import org.junit.Test;


import  io.restassured.response.Response;
import org.junit.Assert;
import static io.restassured.RestAssured.*;
//import  static io.restassured.matcher.ResponseAwareMatcher.*;




public class Test01_GET {
	
	
	@Test
	public void TEST_O1() {
		
Response response = get("https://reqres.in/api/users?page=2");
	
		response.getBody();
		System.out.println(response.asString());
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		
		
		int statusCode = response.getStatusCode();
		
		Assert.assertEquals(statusCode, 200);
		
		 if(statusCode==200){  
		        System.out.println("Code 200 ok. Test_01 passed");  
		    }else{  
		        System.out.println("Test_01 Failed");  
		    }  
	}
	
}