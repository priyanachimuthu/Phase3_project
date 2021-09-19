package pack1;

import org.junit.Before;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssured_POSTRequest {
	
	
	@Before
	public void Beforetest()
	{
		 //create base path
        RestAssured.baseURI="https://reqres.in";
	}	
	
	//POST REQUEST
	
	@Test
	public void postreqwithheaders() {
		
		 // create a request  (blank)
	    RequestSpecification request= RestAssured.given();
	    
	    String reqBody = "{\r\n"
	    		+ "    \"name\": \"morpheus\",\r\n"
	    		+ "    \"job\": \"leader\"\r\n"
	    		+ "}";
	    
				
				request.header("content-type","application/json")
                .header("header2","value2")
                .header("header","value3")
                .body(reqBody)
                .log().all()
                .post("/api/users").then().log().all();
	}

}
