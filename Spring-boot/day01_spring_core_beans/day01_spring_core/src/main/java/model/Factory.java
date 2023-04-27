package model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Factory {
    static int idAuto = 100;
    int id;
    String name;
    String description;
    double workReview;

    public Factory(int id, String name,String description, double workReview) {
        this.id = idAuto++;
        this.name = name;
        this.description = description;
        this.workReview = workReview;
    }

}
