package ch14_abstraction.abstract_classes;
/*
    abstract : 추상적인

    추상 클래스
    1. 추상 메서드가 하나라도 포함되면 해당 클래스는 추상 클래스로 정의돼야 한다.
    2. 추상 클래스는 생성할 수 없다.  -> 객체 생성 불가능
    3. 그 외의 다른 특징은 일반 클래스와 동일함.
    4. 상속을 전제로 하는 클래스임

    추상 클래스 : 추상 메서드가 하나 이상인 클래스
    추상 메서드 : 선언만 있고, 구현은 없는 메서드

    추상 클래스의 장점 :
        코드의 재사용성을 높이고 설계를 보다 명확하게 할 수 있도록 도와줌.

    추상 클래스의 목적
        1. 공통된 기능 제공 : 여러 클래스에서 공통적으로 사용하는 기능을 추상 클래스에서 정의 할 수 있다.
        2. 구체적인 구현 강제 : 추상 메서드를 통해 서브 클래스가 반드시 특정 메서드를 구현하도록 강제할 수 있다.
        3. 코드의 재사용성 : 중복되는 코드를 줄이고, 유지 보수성을 높일 수 있다.

        추상 클래스에서 주의할 점 :
            - 추상 클래스는 객체를 생성할 수 없다.

        super 키워드 - 슈퍼 클래스의 멤버 및 메서드에 접근하기 위해서 사용
            1. 서브 클래스에서 슈퍼 클래스로 생성자를 호출 할 때 사용 -> super(매개변수)
            2. 서브 클래스에서 슈퍼 클래스로 메서드를 호출 할 때 사용 -> super.메서드명()

       생성할 클래스 목록
       Factory.java         -> 디자인 패턴 중 Factory 형태는 아님.
       PhoneFactory.java    -> Factory 상속 받기
       TabletFactory.java   -> Factory 상속 받기
 */

public class Main {
    public static void main(String[] args) {
        Factory factory1 = new Factory("일반 공장") {
            @Override
            public void produce(String model) {

            }

            @Override
            public void manage() {

            }
        };      // 추상 클래스에서 직접적으로 객체를 만들려고 하면 익명 클래스를 통해 생성됨. -> 추후 수업 예정

        // PhoneFactory 및 TabletFactory 생성
        PhoneFactory phoneFactory1 = new PhoneFactory("애플 스마트폰 공장");
        TabletFactory tabletFactory1 = new TabletFactory("애플 태블릿 공장");

        phoneFactory1.produce("아이폰16");
        phoneFactory1.produce("아이폰16 Pro");

        tabletFactory1.produce("아이패드 Pro 13인치");

        System.out.println();

        phoneFactory1.manage();     // Factory.java 에 있던 추상 메서드 manage 를 Override 해서 재정의한 PhoneFactory 만의 메서드

        tabletFactory1.manage();

        System.out.println();
        phoneFactory1.printInfo();      // 슈퍼 클래스의 일반 메서드를 서브 클래스의 객체가 호출
        tabletFactory1.printInfo();
    }
}
