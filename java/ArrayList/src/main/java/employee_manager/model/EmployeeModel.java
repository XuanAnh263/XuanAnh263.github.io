package employee_manager.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString


public class EmployeeModel {
    private int id;
    private String name;
    private String email;
    private int salary;
}
