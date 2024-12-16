package ch18_static;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductMain {
    // 필드 선언
    private String name;

    //  여기에 나오지는 않지만 getter 와 setter 를 정의함. -> 이걸 main 매서드 영역 내에서 객체생성 및 필드를 set 하고
    //  필드를 set 하고, 그 값을 get 할 수 있음.

    public static void main(String[] args) {
        System.out.println("현재 시리얼 넘버 : " + Product.autoIncrement);

        Product product1 = new Product("p1");

        System.out.println("현재 시리얼 넘버 : " + Product.autoIncrement);
        System.out.println("p1의 시리얼 넘버 : " + product1.getSerialNumber());

        Product product2 = new Product("p2");

        System.out.println("현재 시리얼 넘버 : " + Product.autoIncrement);
        System.out.println("p2의 시리얼 넘버 : " + product2.getSerialNumber());

        //  클래스명 객체명 = new 객체명() -> 여기서부터는 Product 객체가 아니라 ProuctMain 의 객체임.
        ProductMain productMain1 = new ProductMain();
        /*
            ProductMain1 의 name 에 "pm1" 을 set 하고 콘솔창에 pm1 이 나오도록 getter 를 이용하시오.
         */
        productMain1.setName("pm1");
        System.out.println(productMain1.getName());
    }
}