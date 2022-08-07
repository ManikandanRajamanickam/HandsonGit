package employee_Payload;

import java.util.ArrayList;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonObject;

import io.restassured.RestAssured;

public class ConvertPayloadFromPojoToJson {
	
	@Test
	void pojoToJson() throws JsonProcessingException {
	
		Nested_Pojo np = new Nested_Pojo();
		 np.setCompanyName("TCS");
		 np.setCompanyHOCity("CBE");
		 np.setCompanyCEO("Mani");
		 
		 ArrayList<String> ssb = new ArrayList<String>();
		 ssb.add("SBI");
		 ssb.add("IND");
		 ssb.add("union");
	     np.setSupportedSalaryBanks(ssb);
	    
	    ArrayList<Integer> pincodesOfCityOffice = new ArrayList<Integer>();
		 pincodesOfCityOffice.add(123123);
		 pincodesOfCityOffice.add(334534);
		 pincodesOfCityOffice.add(423525);
		 np.setPincodesOfCityOffice(pincodesOfCityOffice);
		 
		 Employee emp = new Employee();
		 emp.setFirstName("Maadfni");
		 emp.setLastName("dsfa");
		 emp.setAge(23);
		 emp.setGender("MALE");
		 emp.setSalary(2.33333);
		 emp.setMarried(false);
		 
		 Employee emp1 = new Employee();
		 emp.setFirstName("Mani");
		 emp.setLastName("kandan");
		 emp.setAge(22);
		 emp.setGender("MALE");
		 emp.setSalary(23.333);
		 emp.setMarried(true);
		 
		 Employee emp2 = new Employee();
		 emp.setFirstName("Madfani");
		 emp.setLastName("kaafdandan");
		 emp.setAge(22);
		 emp.setGender("FEMALE");
		 emp.setSalary(23.333);
		 emp.setMarried(true);
		
	  ArrayList<Employee> empDetails= new ArrayList<Employee>();
	  empDetails.add(emp);
	  empDetails.add(emp1);
	  empDetails.add(emp2);
	  
	  np.setEmployee(empDetails);
		
	  
	  Contractor cont = new Contractor();
	  cont.setFirstName("hari");
	  cont.setLastName("nari");
	  cont.setContractFrom("today");
	  cont.setContractTo("2mrow");
	  
	  
	  Contractor cont1 = new Contractor();
	  cont1.setFirstName("hasdsri");
	  cont1.setLastName("nardsdi");
	  cont1.setContractFrom("tsdoday");
	  cont1.setContractTo("2mrsdow");
	  
	  ArrayList<Contractor> contractors = new ArrayList<Contractor>();
	  contractors.add(cont);
	  contractors.add(cont1);
	  np.setContractors(contractors);
	  
 
	  CompanyPFDeails companyPFDeails = new CompanyPFDeails();
	  
	  companyPFDeails.setPfName("manida");
	  companyPFDeails.setPfCity("cbe");
	  companyPFDeails.setPfYear(2021);
	  companyPFDeails.setNoOfEmployees(10);
	  
	  np.setCompanyPFDeails(companyPFDeails);
	  
	  
	  ObjectMapper mapper = new ObjectMapper();
	  String requestPayload = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(np);
	  System.out.print("Req Payload is  : " + requestPayload.toString());
 
	  JsonObject jsonObject = new  JsonObject();
	  jsonObject.getAsString();
	   
	}
	
}
