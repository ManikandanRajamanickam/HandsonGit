package petShopAPI;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Category {
	public int id;
	public String name;
	
	public Category(int id, String name) {
	 
		this.id = id;
		this.name = name;
	}
}
