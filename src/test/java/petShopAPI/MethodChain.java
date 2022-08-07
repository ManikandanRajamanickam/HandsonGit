package petShopAPI;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;import net.bytebuddy.implementation.bytecode.assign.Assigner.EqualTypesOnly;

public class MethodChain {

		ApiPart part = new ApiPart();
		RestAssured rest = new RestAssured();
		POJOforGet com = new POJOforGet();
		
	@Test
	void getPetDetail() {
			String uri = "https://petstore.swagger.io/v2/store/order/2";
			rest.given().contentType("application/json").when().get(uri).then().statusCode(200).log().all();
	}

	@Test(enabled =  false)
	void postPetDetail() throws JsonProcessingException {
		part.setId(2);
		part.setPetId(5);
		part.setShipDate("2022-08-04T15:09:36.810Z");
		part.setQuantity(10);
		part.setStatus("placed");
		part.setComplete(true);
		
		ObjectMapper om = new ObjectMapper();
		String requestBody = om.writerWithDefaultPrettyPrinter().writeValueAsString(part);
		System.out.println(requestBody);
		
		rest.given()
					.contentType("application/json")
					.body(requestBody)
			   .when()
					.post("https://petstore.swagger.io/v2/store/order")
					.then()
					.statusCode(200)
					.and()
					.body("body.id", equalTo(2))
					.and()
					.body("body.status", equalTo("placed"))
					.log().all();
			}

	@Test
	void postComplexPetDetail() throws JsonProcessingException {	    
			com.setId(0);
			Category category = new Category(1, "test");
		    com.setCategory(category);
		    com.setName("testes");
		    com.setPhotoUrls("c:\\");
		    Tag tags = new Tag(2, "asfdfsa");
		    com.setTags(tags);
		    com.setStatus("active");
		    
		    ObjectMapper mapper = new  ObjectMapper();
		    String responseData = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(com);
		    System.out.print(responseData);
		    
		    
	}

	@Test
	void deletePetDetail() {

	}

}
