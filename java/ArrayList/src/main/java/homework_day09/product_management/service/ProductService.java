package homework_day09.product_management.service;

import homework_day09.product_management.database.ProductDatabase;
import homework_day09.product_management.model.ProductModel;
import homework_day09.product_management.repository.ProductRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductService {
    Scanner sc = new Scanner(System.in);
    ProductRepository productRepository = new ProductRepository();

    // 1. Xem danh sách sản phẩm
    public void showAllProducts() {
//        System.out.printf("Id", "Name", "Description", "Quantity", "Price");

        for (ProductModel p : productRepository.showAllProducts()) {
            System.out.println(p);
        }
    }

    // 2. Tìm sản phẩm theo tên
    public void findByName(String name) {
        ArrayList<ProductModel> products = new ArrayList<>();
        for (ProductModel p : productRepository.showAllProducts()) {
            if (p.getName().toLowerCase().contains(name.toLowerCase())) {
                products.add(p);
            }
        }

        if (products.size() > 0) {
//            System.out.printf("Id", "Name", "Description", "Quantity", "Price");

            for (ProductModel p : products) {
                System.out.println(p);
            }
        } else {
            System.out.println("Không có sản phẩm nào có tên là: " + name);
        }


    }

    // 3. Tìm sản phẩm theo id
    public void findById(int id) {
        int count = 0;
        for (ProductModel p : productRepository.showAllProducts()) {
            if (p.getId() == id) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không có sản phẩm nào có Id là: " + id);
        } else {
//            System.out.printf("Id", "Name", "Description", "Quantity", "Price");
            for (ProductModel p : productRepository.showAllProducts()) {
                if (p.getId() == id) {
                    System.out.println(p);
                }
            }

            boolean out = false;
            while (!out) {
                subMenu();
                int subOption = sc.nextInt();
                sc.nextLine();
                switch (subOption) {
                    case 1:
                        this.deleteById(id);
                        out = true;
                        break;
                    case 2:
                        System.out.print("Nhập vào số lượng sản phẩm: ");
                        int quantity = sc.nextInt();
                        sc.nextLine();

                        this.updateById(id, quantity);
                        break;
                    case 0:
                        out = true;
                        break;
                    default:
                        System.out.println("Lựa chọn không tồn tại!");
                        break;
                }
            }
        }
    }

    // 4. Xóa sản phẩm theo id
    public void deleteById(int id) {
        productRepository.deleteProduct(id);
    }

    // 5. Cập nhật số lượng sản phẩm

    public void updateById(int id, int quantity) {
        productRepository.updateQuantityProduct(id, quantity);
    }

    // 6. Tìm các san phẩm có số lượng dưới 5
    public void findByQuantity(int quantity) {
        ArrayList<ProductModel> product = new ArrayList<>();
        for (ProductModel p : productRepository.showAllProducts()) {
            if (p.getQuantity() < quantity) {
                product.add(p);
            }
        }

        if (product.isEmpty()) {
            System.out.println("Không có sản phẩm nào có số lượng dưới: " + quantity);
        } else {
//            System.out.printf("Id", "Name", "Description", "Quantity", "Price");

            for (ProductModel p : product) {
                System.out.println(p);
            }
        }

    }

    // 7. Tìm san phẩm theo mức giá
    public void findByPrice(double minPrice, double maxPrice) {
        ArrayList<ProductModel> product = new ArrayList<>();
        for (ProductModel p : productRepository.showAllProducts()) {
            if (p.getPrice() < maxPrice && p.getPrice() >= minPrice) {
                product.add(p);
            }
        }
        if (product.isEmpty()) {
            System.out.println("Không có sản phẩm nào thỏa mãn!");
        } else {
//            System.out.printf("Id", "Name", "Description", "Quantity", "Price");

            for (ProductModel p : product) {
                System.out.println(p);
            }
        }
    }

    public void subMenu() {
        System.out.println("\nBạn muốn tiếp tục? ");
        System.out.println("1. Xóa sản phẩm");
        System.out.println("2. Cập nhật số lượng sản phẩm");
        System.out.println("0. Trở về menu");
        System.out.print("Bạn chọn: ");
    }

}
