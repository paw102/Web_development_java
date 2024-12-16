package ch18_static;

import lombok.Data;

@Data
public class Product {
    public static int autoIncrement = 20240000; // static 변수 -> 객체마다 고유의 값을 가진 것이 아닌, 모든 객체가 공유하는 속성

    //  객체마다 가지는 고유한 값
    private int serialNumber;
    private String productName;

    // 생성자 정의
    public Product(String ProductName) {
        serialNumber = ++autoIncrement;
        this.productName = ProductName;
        System.out.println(productName + " 제품이 생산되었습니다.");
    }
}
