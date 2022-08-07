package employee_Payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contractor {
	 
	    public String firstName;
	    public String lastName;
	    public String contractFrom;
	    public String contractTo;
 
}
