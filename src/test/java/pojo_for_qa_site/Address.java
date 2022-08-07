package pojo_for_qa_site;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
	    public String street;
	    public String suite;
	    public String city;
	    public String zipcode;
	    public List<Geo> geo;
}
