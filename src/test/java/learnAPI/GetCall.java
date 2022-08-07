package learnAPI;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.util.List;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.util.JSONPObject;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;
 

public class GetCall {
 
    static Response res;
	static String fname;
     @Test
	 void getcall() {
    	  
    	 RequestSpecification rs = RestAssured.given().baseUri("https://reqres.in/api/users?").basePath("/api/users");
    	 	
    	 RestAssured.baseURI="https://reqres.in/api/users";
		 res = given()
			
		.when()
			.get(baseURI)
		.then()
			.statusCode(200)
			.and()
			.body(JsonSchemaValidator.matchesJsonSchema(new File("C:\\WorkSpace\\RestAssured\\src\\test\\resources\\resources\\JsonSchema.json")))
			.body("data.email", notNullValue())
			.body("data[0].first_name", equalTo("George")).log().all()
			.extract().response();
		   
		 fname = res.jsonPath().getString("data[0].email");
		 System.out.println(fname);
		 
	}
     
     @Test (dependsOnMethods = {"getcall"})
     void datafrommethod() {
    	 	System.out.print("mail into fname is : " + fname);
     }
}
 
