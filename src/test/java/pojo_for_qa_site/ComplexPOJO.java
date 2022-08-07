package pojo_for_qa_site;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComplexPOJO {
	 
	public Properties prop;
	Employee employee = new Employee();
	WebDriver driver;
	
	void loadDataFromFile() throws IOException {
		BufferedReader file = new BufferedReader(new FileReader("C:\\WorkSpace\\RestAssured\\src\\test\\resources\\resources\\data.properties"));
		 prop = new Properties();
		 prop.load(file);
	} 
	
	
	@Test
	void devQa() throws IOException {
		 FileInputStream fileInputStream = new  FileInputStream("C:\\WorkSpace\\RestAssured\\src\\test\\resources\\resources\\data.properties");
		 prop = new Properties();
		 prop.load(fileInputStream);
		 
		
		employee.setId(1);
		employee.setName(prop.getProperty("name"));
		employee.setUsername(prop.getProperty("username"));
		employee.setEmail(prop.getProperty("email"));	
//		Geo geo = new  Geo(prop.getProperty("lat"), prop.getProperty("lang"));
//	    Address add = new Address(prop.getProperty("street"), prop.getProperty("suite"), prop.getProperty("city"), prop.getProperty("zipcode"), geo);		
//	    employee.setAddress(add);
		Geo geo = new Geo();
		geo.setLat(prop.getProperty("lat"));
		geo.setLng(prop.getProperty("lang"));
		List<Geo> loc = new ArrayList<Geo>();
		loc.add(geo);
		
		Address addr = new Address();
		addr.setStreet(prop.getProperty("street"));
		addr.setSuite(prop.getProperty("suite"));
		addr.setCity(prop.getProperty("city"));
		addr.setZipcode(prop.getProperty("zipcode"));
		addr.setGeo(loc);
		List<Address> adress = new ArrayList<Address>();
		adress.add(addr);
		employee.setAddress(adress);
	    employee.setPhone(prop.getProperty("phone"));
	    employee.setWebsite(prop.getProperty("website"));
	  // Company comp = new Company(prop.getProperty("cname"), prop.getProperty("catchPhrase"), prop.getProperty("bs"));
	  // employee.setCompany(comp);
	    Company comp = new Company();
	    comp.setName(prop.getProperty("cname"));
	    comp.setCatchPhrase(prop.getProperty("catchPhrase"));
	    comp.setBs(prop.getProperty("bs"));
	    List<Company> c = new ArrayList();
	    c.add(comp);
	    employee.setCompany(c);
	    System.out.println(employee);
	    
	    ObjectMapper mapper = new ObjectMapper();
	    String reponse = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee);
	    System.out.println(reponse);
	    
	    
	}

}
