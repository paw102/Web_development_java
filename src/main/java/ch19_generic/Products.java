package ch19_generic;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Products<T> {
    //  필드 선언
    private String productName;
    private T productInfo;
}
