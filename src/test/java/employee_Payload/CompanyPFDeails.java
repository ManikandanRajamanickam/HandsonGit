package employee_Payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompanyPFDeails {
	    public String pfName;
	    public String pfCity;
	    public int pfYear;
	    public int noOfEmployees;
}
