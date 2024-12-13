package ch17_bean;

public class PersonMain {
    // Person 객체 생성 객체명 person1 으로 지은 후 이름은 "박수빈" 으로 짓기
    Person person1 = new Person("박수빈");     // final 때문에 new Person(); 으로 생성 불가능

    //  PersonLombok 객체 생성
    PersonLombok person2 = new PersonLombok("김이");

    // 이상의 코드에서 확인 할 수 있는 것은 Person 클래스에서 alt + insert 를 통해 하나하나 생성자를 만들었던 것을
    // PersonLombok 클래스에서 두 개의 애너테이션을 통해서 자동으로 생성자를 만들었고, 그 기능이 동일하다는 점임.
}
