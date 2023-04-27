package controller;

import repository.WorkerRepository;

import java.util.Scanner;

public class Controller {
    WorkerRepository workerRepository = new WorkerRepository();

    public void run() {
        Scanner sc = new Scanner(System.in);
        boolean isQuit = false;
        int option = 0;
        while (!isQuit) {
            menu();
            System.out.print("Nhập lựa chọn: ");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1: {
                    workerRepository.addWorker();
                    workerRepository.showWorkers();
                    break;
                }
                case 2: {
                    workerRepository.addFactory();
                    workerRepository.showFactories();
                    break;
                }
                case 3: {
                    workerRepository.showWorkers();
                    break;
                }
                case 4: {
                    workerRepository.showFactories();
                    break;
                }
            }
        }
    }

    public void menu() {
        System.out.println("1 -- Thêm công nhân mới và in ra danh sách công nhân");
        System.out.println("2 -- Thêm xưởng mới và in ra danh sách xưởng");
        System.out.println("3 -- Xem danh sách công nhân");
        System.out.println("4 -- Xem danh sách xưởng");
    }
}
