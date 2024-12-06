package ch09_classes;

public class ProductMain {
    public static void main(String[] args) {
        // 객체 생성 방법 -> 클래스명 객체명 = new 클래스명 ();
        // 이제는 new 클래스명() 에서 '클래스명()' 이 생성자라는 것을 알 수 있음.
        // 1번 지시 사항 - 기본 생성자 사용
        Product product01 = new Product();
        // 기본 생성자를 사용했다는 말은 객체 생성 시 속성에 아무런 값을 대입하지 않겠다는 의미이므로
        // 추가적인 코드 작성을 통해 속성에 값을 대입해야만 함.
        product01.productNum = 1341356;
        product01.productName = "LG제이패드";
        product01.showInfo();
        System.out.println();

        // 2번 지시 사항 - pNum 매개변수 사용
        Product product02 = new Product(623741);
        product02.productName = "GS충전기";
        product02.showInfo();
        System.out.println();

        // 3번 지시 사항 - pName 매개변수 사용
        Product product03 = new Product("피치패드");
        product03.productNum = 143156;
        product03.showInfo();
        System.out.println();

        // 4번 지시 사항 - pNum, pName 매개변수 사용
        Product product04 = new Product(1231, "블루미플립6");
        product04.showInfo();

    }
}
