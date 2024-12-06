package ch09_classes;

/*
    여러 가지 생성자를 정의하시오.
    기본 생성자
    매개변수 생성자

    showInfo() 정의

    ex)

    1. 기본 생성자 사용

    "해당 제품의 시리얼 넘버는 1341356 이고
     제품 명은 LG제이패드 입니다."

    2. 시리얼 넘버 사용한 객체 생성

     해당 제품의 시리얼 넘버는 623741이고,
     제품명은 GS충전기입니다.

     3. 제품명을 사용한 객체 생성

     해당 제품의 시리얼 넘버는 143156이고,
     제품명은 피치패드입니다.

     4. 시리얼넘버 및 제품명을 사용한 객체 생성

     해당 제품의 시리얼 넘버는 1231 이고,
     제품명은 블루미플립6 입니다.

     ProductMain.java 를 생성하고 객체를 생성한 다음
 */

public class Product {
    //필드 선언
    int productNum;
    String productName;

    //  기본 생성자
    Product () {
    }
    // 매개변수 생성자 - 1 (매개변수 하나)
    Product (int pNum){
        this.productNum = pNum;
    }
    // 매개변수 생성자 - 2 (매개변수 하나)
    Product (String pName) {
        this.productName = pName;
    }
    // 매개변수 생성자 (매개변수 두 개)
    Product (int pNum, String pName){
        this.productNum = pNum;
        this.productName = pName;
    }
    //showInfo() 메서드 정의
    void showInfo(){
        System.out.println("해당 제품의 시리얼 넘버는 "+ productNum + "이고" + "\n제품 명은 " + productName + " 입니다." );
    }
}
