package pojo_for_qa_site;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class Employee {
	
    public Employee() {
	 
	}
	public int id;
    public String name;
    public String username;
    public String email;
    public List<Address> address;
    public String phone;
    public String website;
    public List<Company> company;
	
}
