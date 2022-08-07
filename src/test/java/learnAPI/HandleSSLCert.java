package learnAPI;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class HandleSSLCert {

	public static void main(String[] args) {
	 
		RestAssured.useRelaxedHTTPSValidation();
		 
		RestAssured.useRelaxedHTTPSValidation("TLS");
		

	}

}
