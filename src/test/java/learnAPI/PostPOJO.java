package learnAPI;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PostPOJO {
		
			private String name;
			private String job;
			
			public PostPOJO(String name, String job) {
				this.name = name;
				this.job = job;
			}
			
			 
}
