package pack1;

//import for junit
import org.junit.Before;
import org.junit.Test;

//import for RestAssured
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class RestAss_GetRequest {

	@Before
	public void Beforetest()
	{
		 //create base path
        RestAssured.baseURI="https://reqres.in";
	}
	
	@Test
	public void getrequest()
	{
	    // create a request  (blank)
	    RequestSpecification request= RestAssured.given();
	    	    
	    //setup and executing request
	    request.get("/api/users").then().log().all();
	}
}
