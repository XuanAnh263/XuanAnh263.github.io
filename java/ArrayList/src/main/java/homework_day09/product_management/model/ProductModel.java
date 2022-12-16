package homework_day09.product_management.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ProductModel {
    private int id;
    private String name;
    private String description;
    private int quantity;
    private int price;

}
