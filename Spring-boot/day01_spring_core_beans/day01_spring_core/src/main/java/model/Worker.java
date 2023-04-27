package model;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Worker {
    static int idAuto = 1000;
    int id;
    String name;
    String address;
    String phone;
    int level;



    public Worker(String name, String address, String phone, int level) {
        this.id = idAuto++;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.level = level;
    }
}
