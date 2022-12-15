package employee_manager;


public class Test {


    public static void main(String[] args) {
        Developer dev = new Developer(1, "Anh", 23, "0986734522", "jakshdu@gmail.com", 6500000, 20);
        dev.display();

        System.out.println();

        Tester tes = new Tester(5,"Xuân", 27, "0978562346", "dsing@gmail.com", 7000000, 10);
        tes.display();

        //Cách 2: nhậo từ bàn phím (chưa ra)
//        CreatEmployee creatEmployee = new CreatEmployee();
//
//        Developer developer = creatEmployee.creatDev();
//        creatEmployee.printInfo(developer);
//
//        Developer[] developers = new Developer[3];
//        for (int i = 0; i < developers.length; i++) {
//            developers[i] = creatEmployee.creatDev();
//        }
//
//        for (Developer value : developers) {
//            creatEmployee.printInfo(value);
//        }
//
//        developer.display();


    }
}
