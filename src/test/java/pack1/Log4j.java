package pack1;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;

import io.restassured.RestAssured;


public class Log4j {

	final Logger LOGGER = LogManager.getLogger(Log4j.class.getSimpleName());
	
	@Before
	public void before() {
		
		 //create base path
	    RestAssured.baseURI="https://reqres.in";
	    
		//PropertyConfigurator.configure(configFilename:"Log4j_properties");
		PropertyConfigurator.configure("log4j.properties");
	}
	
	@Test
	public void test1() {
		
		System.out.println(Log4j.class.getSimpleName());
		
		LOGGER.debug("This is debug message");
		LOGGER.info("This is a INFO message");		
		LOGGER.warn("This is a warn message");
		LOGGER.error("This is a error message");
		LOGGER.fatal("This is a fatal message");
		
		
	}
	
}
