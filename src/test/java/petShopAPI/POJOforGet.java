package petShopAPI;

import java.util.ArrayList;

import learnAPI.PostPOJO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

 @Data
 @AllArgsConstructor
public class POJOforGet {

    public int id;
    public Category category;
    public String name;
    public String photoUrls;
    public Tag tags;
    public String status;

	public POJOforGet() {
		
	}
}
