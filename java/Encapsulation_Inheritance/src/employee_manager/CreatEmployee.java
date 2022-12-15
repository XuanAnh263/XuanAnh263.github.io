package employee_manager;

import java.util.Scanner;

public class CreatEmployee {
    public Developer creatDev() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ID : " );
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("NAME : " );
        String name = scanner.nextLine();
        System.out.println("AGE : ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("PHONE : " );
        String phone = scanner.nextLine();
        System.out.println("EMAIL : ");
        String email = scanner.nextLine();
        System.out.println("SALARY : " );
        int salaryBasic = scanner.nextInt();

        Developer developer = new Developer(id, name, age, phone, email, salaryBasic, creatDev().getOvertimeHours());

        return developer;
    }

    public Tester creatTes() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ID : " );
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("NAME : " );
        String name = scanner.nextLine();
        System.out.println("AGE : ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("PHONE : " );
        String phone = scanner.nextLine();
        System.out.println("EMAIL : ");
        String email = scanner.nextLine();
        System.out.println("SALARY : " );
        int salaryBasic = scanner.nextInt();

        Tester tester = new Tester(id, name, age, phone, email,salaryBasic, creatTes().getError());
        return tester;
    }



    public void printInfo(Developer dev) {
        System.out.println("ID : " + dev.getId());
        System.out.println("NAME : " + dev.getName());
        System.out.println("AGE : " + dev.getAge());
        System.out.println("PHONE : " + dev.getPhone());
        System.out.println("Email : " + dev.getEmail());
        System.out.println("SALARY BASIC : " + dev.getSalaryBasic());

    }

    public void printInfo1(Tester tes) {
        System.out.println("ID : " + tes.getId());
        System.out.println("NAME : " + tes.getName());
        System.out.println("AGE : " + tes.getAge());
        System.out.println("PHONE : " + tes.getPhone());
        System.out.println("Email : " + tes.getEmail());
        System.out.println("SALARY BASIC : " + tes.getSalaryBasic());

    }





}
