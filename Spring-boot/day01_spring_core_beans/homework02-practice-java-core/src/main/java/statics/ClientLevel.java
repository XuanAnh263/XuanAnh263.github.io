package statics;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
public enum ClientLevel {
    LEVEL_1(1),
    LEVEL_2(2),
    LEVEL_3(3);


    public int level;
}
