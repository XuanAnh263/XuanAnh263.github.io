package employee_manager.repository;

import employee_manager.datebase.EmployeeDatabase;
import employee_manager.model.EmployeeModel;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
    public List<EmployeeModel> findAll() {
        return EmployeeDatabase.employeeModels;
    }

    public void sava(EmployeeModel employeeModel) {
        EmployeeDatabase.employeeModels.add(employeeModel);
    }


    //findByNameContainsIgnoreCase: tìm kiếm theo tên và không phân biệt hoa thường
    public ArrayList<EmployeeModel> findByNameContainsIgnoreCase(String name) {
        ArrayList<EmployeeModel> rs = new ArrayList<>();

        for (EmployeeModel e : EmployeeDatabase.employeeModels) {
            if (e.getName().toLowerCase().contains(name.toLowerCase())) {
                rs.add(e);
            }

        }
        return rs;
    }

    public EmployeeModel findById(int id) {
        ArrayList<EmployeeModel> rs1 = new ArrayList<>();
        for (EmployeeModel i: EmployeeDatabase.employeeModels) {
            if (i.getId() == id) {
                return i;
            }
        }
        return null; //id không phải mảng nên return null
    }

    public void deleteById(int id) {
        ArrayList<EmployeeModel> rs2 = new ArrayList<>();
        for (EmployeeModel d: EmployeeDatabase.employeeModels) {
            if (d.getId() == id) {
                rs2.remove(id);
            }
        }
    }

    public ArrayList<EmployeeModel> findBySalary(int minSalary, int maxSalary) {
        ArrayList<EmployeeModel> sa = new ArrayList<>();
        for (EmployeeModel s : EmployeeDatabase.employeeModels) {
            if (s.getSalary() >= minSalary && s.getSalary() <= maxSalary) {

            }
        }
        return sa;
    }
}
