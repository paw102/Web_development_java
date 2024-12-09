package ch13_inheritance.product;

public class ProductMain {
    public static void main(String[] args) {
        // Item 의 객체 생성
        Item item1 = new Item("일반 상품", "일반 카테고리");
//        item1.displayInfo(); // 오류 발생
//        item1.setStock(); // 오류 발생
        // 이상의 코드가 오류가 난다는 점에서 알 수 있는 점
        // 자식은 부모의 필드 및 메서드를 사용할 수 있으나
        // 부모 클래스의 객체는 자식 클래스의 메서드를 사용 할 수 없음.

        // 실행 예
        // 이 상품은 일반 상품입니다.
        // 이 상품은 일반 카테고리입니다. -> getter 를 활용하여 해당 출력문이 콘솔에 나오도록 작성하시오
                                        //  -> ProductMain 에 작성하시오.
        System.out.println("이 상품은 " + item1.getName() + "입니다.");
        System.out.println("이 상품은 " + item1.getCategory() + "입니다.");

        // 과제
        // Product 객체를 생성하시오.
        // 전자제품, 가전, 100000, 10으로 설정하고 displayInfo() 를 통해서 정보를 출력하시오

        //product1 의 이름을 "가전 제품" 으로 바꾸고, getName 을 통해서 바뀐 것을 콘솔창에 출력하시오
    }
}
