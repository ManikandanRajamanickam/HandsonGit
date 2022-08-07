package petShopAPI;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
 
public class Tag {
	    public int id;
		public String name;

	    public Tag(int id, String name) {
			this.id = id;
			this.name = name;
		}

}
