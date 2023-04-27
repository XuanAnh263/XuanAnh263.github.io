package repository;

import database.FactoryDB;
import database.WorkerDB;
import model.Factory;
import model.Worker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkerRepository {
    List<Worker> workerList = new ArrayList<>();
    List<Factory> factoryList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);


    public void addWorker() {

        int newId = workerList.isEmpty() ? 1000 : workerList.get(workerList.size() - 1).getId() + 1;

        System.out.print("Nhập tên: ");
        String name = sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String address = sc.nextLine();
        System.out.print("Nhập số điện thoại: ");
        String phone = sc.nextLine();

        System.out.print("Nhập bậc thợ: ");
//        int level =  Integer.parseInt(sc.nextLine());
        int level;
        do {
            System.out.print("Bac tho (tu 1 den 7): ");
            while (!sc.hasNextInt()) {
                System.out.print("Bac tho (tu 1 den 7): ");
                sc.nextLine();
            }
            level = sc.nextInt();
            sc.nextLine();
        } while (level < 1 || level > 7);

        Worker worker = new Worker(newId, name, address, phone, level);
        workerList.add(worker);
        System.out.println("Thêm công nhân mới thành công\n" + worker);


    }

    public void showWorkers() {
        System.out.println("Danh sách công nhân:");
        for (Worker worker: WorkerDB.workerList) {
            System.out.println(worker);
        }
    }

    public void addFactory() {
        int newId = factoryList.isEmpty() ? 1000 : factoryList.get(factoryList.size() - 1).getId() + 1;
        System.out.print("Nhập tên: ");
        String name = sc.nextLine();
        System.out.print("Mô tả công việc: ");
        String describe = sc.nextLine();
        System.out.print("Nhập hệ số công việc: ");
//        double workReview =  Double.parseDouble(sc.nextLine());
        double workReview;
        do {
            System.out.print("He so cong viec (tu 1 den 20): ");
            while (!sc.hasNextDouble()) {
                System.out.print("He so cong viec (tu 1 den 20): ");
                sc.next();
            }
            workReview = sc.nextDouble();
            sc.nextLine();
        } while (workReview < 1 || workReview > 20);

        Factory factory = new Factory(newId, name, describe, workReview);
        FactoryDB.factoryList.add(factory);
        System.out.println("Thêm xưởng mới thành công\n" + factory);
    }

    public void showFactories() {
        System.out.println("Danh sách xưởng");
        for (Factory factory: FactoryDB.factoryList) {
            System.out.println(factory);
        }
    }
}
