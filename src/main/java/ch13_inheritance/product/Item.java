package ch13_inheritance.product;

/*
    필드로
    1) private String name, private String category 를 선언

    2) 생성자를 AllArgsConstructor 로 생성

    3) setter / getter 를 각각 생성

    4) Product.java 로 가서 Item 이 부모 클래스 / Product 가 자식 클래스가 되도록 명령어를 입력하시오
 */

public class Item {
    // 필드 생성
    private String name;
    private String category;

    // RequiredArgsConstructor 로 선언하지 않은 이유 : 필드 두 개 전부 String 이기 때문에 컴파일 에러가 날 수 있음.

    //생성자

    public Item(String name, String category) {
        System.out.println("Item 을 생성하였습니다. ");
        this.name = name;
        this.category = category;
    }

    // 메서드 생성

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
