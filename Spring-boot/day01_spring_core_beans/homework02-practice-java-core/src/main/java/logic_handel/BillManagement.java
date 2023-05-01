package logic_handel;

import entity.Bill;
import entity.BillDetail;
import entity.Client;
import entity.Service;

import java.util.*;

public class BillManagement {
    private List<Bill> bills;
    private ClientManagement clientManagement;
    private ServiceManagement serviceManagement;


    public BillManagement(ClientManagement clientManagement, ServiceManagement serviceManagement) {
        this.bills = new ArrayList<>();
        this.clientManagement = clientManagement;
        this.serviceManagement = serviceManagement;

    }



    public void logBill() {
        System.out.println("Bạn muốn lập hóa đơn cho bao nhiêu khách hàng");
        int clientNumber;
        do {
            try {
                clientNumber = new Scanner(System.in).nextInt();
                if (clientNumber > 0) break;
                System.out.println("Số lượng nhập vào phải lớn hơn 0. Nhập lại: ");
            } catch (InputMismatchException ex) {
                System.out.println("Vui lòng nhập số");
            }
        } while (true);
        for (int i = 0; i < clientNumber; i++) {
            System.out.println("Nhập ID của khách hàng thứ " + (i + 1) + " mà bạn muốn lập hóa đơn: ");
            int clientId;
            Client client;
            do {
                try {
                    clientId = new Scanner(System.in).nextInt();
                    client = clientManagement.findById(clientId);
                    if (client != null) break;
                    System.out.println("ID không tồn tại trong hệ thống. Vui lòng nhập lại: ");
                } catch (InputMismatchException ex) {
                    System.out.println("Vui lòng nhập số");
                }
            } while (true);

            System.out.println("Khách hàng này sử dụng bao nhiêu dịch vụ:");
            int serviceNumber;
            do {
                try {
                    serviceNumber = new Scanner(System.in).nextInt();
                    if (serviceNumber > 0 && serviceNumber <= 5) break;
                    System.out.println("Số lượng dịch vụ nhập vào từ 1 tới 5, nhập lại: ");
                } catch (InputMismatchException ex) {
                    System.out.println("Vui lòng nhập số");
                }
            } while (true);

            List<BillDetail> billDetails = new ArrayList<>();
            for (int j = 0; j < serviceNumber; j++) {
                System.out.println("Nhập mã dịch vụ thứ " + (j + 1) + " mà khách hàng này sử dụng: ");
                int serviceId;
                Service service;
                do {
                    try {
                        serviceId = new Scanner(System.in).nextInt();
                        service = serviceManagement.findById(serviceId);
                        if (service != null) break;
                        System.out.println("ID không tồn tại trong hệ thống, vui lòng nhập lại: ");
                    } catch (InputMismatchException ex) {
                        System.out.println("Vui lòng nhập số");
                    }
                } while (true);

                System.out.println("Khách hàng này sử dụng dịch vụ vừa nhập là bao nhiêu: ");
                int quantity;
                do {
                    try {
                        quantity = new Scanner(System.in).nextInt();
                        if (quantity > 0) break;
                        System.out.println("Số lượng dịch vụ nhập vào phải lớn hơn 0, nhập lại");
                    } catch (InputMismatchException ex) {
                        System.out.println("Vui lòng nhập số");
                    }
                } while (true);

                BillDetail billDetail = new BillDetail(service, quantity);
                billDetails.add(billDetail);
            }
            Bill bill = new Bill(client, billDetails);
            bills.add(bill);
        }
        showInfo();
    }



    public void sortByName() {
        Collections.sort(bills, new Comparator<Bill>() {
            @Override
            public int compare(Bill o1, Bill o2) {
                return o1.getClient().getName().compareToIgnoreCase(o2.getClient().getName());
            }
        });
        showInfo();
    }

    public void sortByUsage() {
        Comparator<BillDetail> usageComparator = Comparator.comparingInt(BillDetail::getUsage).reversed();
        bills.forEach(bill -> Collections.sort(bill.getBillDetails(), usageComparator));
        showInfo();
    }

    public void showInfo() {
        bills.forEach(System.out::println);
    }
}
