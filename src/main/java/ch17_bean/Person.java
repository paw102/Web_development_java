package ch17_bean;

public class Person {
    // 필드 선언
    private final String name;  // 필드에 final 이 붙어있으면 생성자들을 만들 때 필수적으로 들어가야만 함.
    private int age;

    public Person(String name) {
        this.name = name;
    }

    // AllArgsConstructor 만들기
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
