package homework_day09.product_management.service;

import homework_day09.product_management.model.ProductModel;
import homework_day09.product_management.repository.ProductRepository;

public class ProductService {
    ProductRepository productRepository = new ProductRepository();
    //1. Xem danh sách sản phẩm (show list of product)
    public void showListOfProduct() {
        for (ProductModel productModel: productRepository.listOfProduct()) {
            System.out.println(productModel);
        }
    }

    //2. Tìm sản phẩn theo tên (find product by name)

}
