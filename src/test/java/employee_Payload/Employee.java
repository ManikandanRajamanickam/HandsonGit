package employee_Payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    public String firstName;
    public String lastName;
    public String gender;
    public int age;
    public double salary;
    public boolean married;
}
