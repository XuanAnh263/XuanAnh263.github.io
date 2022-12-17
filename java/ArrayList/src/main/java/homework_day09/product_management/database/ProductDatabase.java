package homework_day09.product_management.database;

import homework_day09.product_management.model.ProductModel;

import java.util.ArrayList;
import java.util.List;

public class ProductDatabase {

    public static ArrayList<ProductModel> productList = new ArrayList<>(List.of(
            new ProductModel(1, "Những người khốn khổ", "Xã hội - Nhân văn", 2, 80_000),
            new ProductModel(2, "Đắc nhân tâm", "Sách tự lực", 3, 250_000),
            new ProductModel(3, "Tuổi trẻ đáng giá bao nhiêu?", "Tài liệu tham khảo", 300, 92_000),
            new ProductModel(4, "7 thói quen hiệu quả", "Sách tự lực", 150, 150_000),
            new ProductModel(5, "Dám nghĩ lớn", "Sách tự lực", 345, 45_000)
    ));
}
