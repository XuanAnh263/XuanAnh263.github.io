package homework_day09.product_management.repository;

import homework_day09.product_management.database.ProductDatabase;
import homework_day09.product_management.model.ProductModel;

public class ProductRepository {
    public ProductModel[] listOfProduct() {
        return ProductDatabase.productModels;
    }
}
