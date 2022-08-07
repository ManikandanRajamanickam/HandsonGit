package learnAPI;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBodyExtractionOptions;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;



public class PostCall {
	
	static String name;
	static String id;
	String json = "";
	private Response response;
	
	PostPOJO pojo = new PostPOJO();
	
	@Test (priority = 1)
	public void  createUser() throws JsonProcessingException {
		
		pojo.setName("morpheus1");
		pojo.setJob("test");
		
		ObjectMapper mapper = new ObjectMapper();
	    json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(pojo);
		System.out.println(json);
		
		response = given()
			.contentType("application/json") 
			.body(json)
			.when().post("https://reqres.in/api/users")
			.then().assertThat()
			.statusCode(201).log().all()
			.extract().response();
		   
		   id = response.jsonPath().getString("id");
		   
		   System.out.println(id);
		    
		
//		PostPOJO pojo1 = RestAssured.get("https://reqres.in/api/users").as(PostPOJO.class);
//		System.out.print(pojo1.getJob());
//		
		   
		   
//		   JsonPath path = new JsonPath(res);
//		   id = path.get("id");
//		    
		  //  String responseBody = response.getBody().toString();
		 //	responseBody.
			// Body validation
			
//			.body("name", equalTo(pojo.getName()))
//			.body("job", equalTo(pojo.getJob()))
//			.statusCode(201).log().all()
//			.extract().asString();
			
//        Header validation 
			
//			.header("sessionId", nullValue())
//			.header("Content-Type", notNullValue());
		    
		    
//	         JsonObject jsonObject = new JsonObject();
//	          myName = jsonObject.get("Name").toString();
//	          myAge = jsonObject.get("Age").toString();
//	         return myName + myAge;
	      	 
	    //  		return response;
	}
	
	
 @Test(priority = 2)
 	void getDataFromJson() {
	  		System.out.println("My name is " + id);
 		System.out.println("My age is my job " + id);
 	}
	
	
	
	
	@Test (priority = 3, enabled =  false)
	void updateUser() throws JsonProcessingException {
	
		pojo.setName("morpheus1");
		pojo.setJob("leader");
		
		ObjectMapper mapper = new ObjectMapper();
		String data = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(pojo);
		 System.out.println(data);
		
		given()
			.contentType("application/json")
			.body(data)
			.when().put("https://reqres.in/api/users/2")
			.then().statusCode(200).log().all();
		
	}
	
	
	@Test (priority = 4, enabled =  false)
	void deleteUser() throws JsonProcessingException {

		given()
			.contentType("application/json")
			.when().delete("https://reqres.in/api/users/2")
			.then().statusCode(204).log().all();
	}
	
}
