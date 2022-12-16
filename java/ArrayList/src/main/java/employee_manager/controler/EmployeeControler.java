package employee_manager.controler;

import employee_manager.repository.EmployeeRepository;

import java.util.Scanner;

public class EmployeeControler {
    EmployeeRepository employeeRepository = new EmployeeRepository();

    public void runMenu() {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        boolean isQuit = false;

        while (!isQuit) {
            showMenu();

            System.out.println("Nhập lựa chọn : ");
            option = scanner.nextInt();

            switch (option) {
                case 1: {
                    System.out.println("Hiển thị thông tin nhân viên");
                    employeeRepository.findAll();
                    break;
                }
                case 2: {
                    System.out.println("Thêm nhân viên mới");
                    doFuntion2();
                    break;
                }
                case 3: {
                    System.out.println("Tìm kiếm nhân viên theo tên");
                    String name = scanner.nextLine();
                    employeeRepository.findByNameContainsIgnoreCase(name);
                    break;
                }
                case 4: {
                    System.out.println("Tìm kiếm nhân viên theo id");
                    int id = scanner.nextInt();
                    employeeRepository.findById(id);
                    break;
                }
                case 5: {
                    System.out.println("Xóa nhân viên theo id");
                    int id = scanner.nextInt();
                    employeeRepository.deleteById(id);
                    break;
                }
                case 6: {
                    System.out.println("Tìm kiếm nhân viên có mức lương từ 5.000.000 --> 10.000.000");
                    int salary = scanner.nextInt();
//                    employeeRepository.findBySalary(salary);
                }
            }
        }
    }

    public void doFuntion2() {
        //Thêm nhân viên mới từ bàn phím
    }
    public void showMenu() {

    }
}
