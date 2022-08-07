package petShopAPI;

import java.time.LocalDate;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiPart {
	public int id;
    public int petId;
    public int quantity;
    public String shipDate;
    public String status;
    public boolean complete;
}
