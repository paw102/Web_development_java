package ch19_generic;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ResponseData<T> {
    private String message;
    private T data;

    // 제네릭을 적용하기 위해서는 클래스 명 옆에 <T> 를 명시함.
}
