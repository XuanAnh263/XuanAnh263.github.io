package logic_handel;

import entity.Client;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ClientManagement {
    private List<Client> clients;

    public ClientManagement() {
        this.clients = new ArrayList<>();
    }
    public void inputInfo() {
        System.out.println("Bạn muốn nhập bao nhiêu khách hàng: ");
        int clientNumber;
        do {
            try {
                clientNumber = new Scanner(System.in).nextInt();
                if (clientNumber > 0) break;
                System.out.println("Số lượng khách hàng phải lớn hơn 0. Vui lòng Nhp lại: ");
            } catch (InputMismatchException ex) {
                System.out.println("Vui lòng nhập số");
            }
        } while (true);

        for (int i = 0; i < clientNumber; i++) {
            Client client = new Client();
            client.inputInfo();
            clients.add(client);
        }
        showClient();
    }
    public void showClient() {
        clients.forEach(System.out::println);
    }
    public Client findById(int id) {
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getId() == id)
                return clients.get(i);

        }
        return null;
    }
}
