package employee_Payload;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Nested_Pojo {
    
	public String companyName;
    public String companyHOCity;
    public String companyCEO;
    public ArrayList<String> supportedSalaryBanks;
    public ArrayList<Integer> pincodesOfCityOffice;
    public ArrayList<Employee> employee;
    public ArrayList<Contractor> contractors;
    public CompanyPFDeails companyPFDeails;    
}
