package employee_manager.datebase;

import employee_manager.model.EmployeeModel;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDatabase {
    public static List<EmployeeModel> employeeModels = new ArrayList<>(List.of(
            new EmployeeModel(1,"Anh", "a@gmail.com", 7_000_000),
            new EmployeeModel(2,"Em", "E@gmail.com", 8_000_000),
            new EmployeeModel(3,"Anh Hai", "a@gmail.com", 17_000_000),
            new EmployeeModel(4,"Anh Ba", "a@gmail.com", 70_000_000),
            new EmployeeModel(5,"Anh Tư", "a@gmail.com", 7_500_000),
            new EmployeeModel(6,"An Nhiên ", "N@gmail.com", 5_000_000)
    ));
}
