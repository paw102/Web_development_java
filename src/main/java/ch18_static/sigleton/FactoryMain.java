package ch18_static.sigleton;
/*
    싱클톤 패턴(Singleton Pattern)
        : 소프트웨어 '디자인 패턴' 중 하나로, 어떤 클래스가 하나의 인스턴스만 갖도록 보장하고, 그 인스턴스에 접근 할 수 있는 전역적인
            접근법을 제공하는 패턴. 예를 들어, 데이터베이스 연결과 같은 리소스는 프로그램 전체에서 하나의 인스턴스만 사용해야 할 때가 많기
            때문에 싱글톤 패턴이 유용함.

    싱글톤 패턴의 특징
        1. 하나의 인스턴스만 존재 : 하나의 인스턴스만 생성되고, 이 인스턴스는 프로그램이 실행되는 동안 유지됨.
        2. 전역 접근법 : 싱글톤 인스턴스는 정적(static) 메서드 를 통하여 어디서든 접근 할 수 있음.
                        -> 객체명.메서드명() X / 클래스명.메서드명() O
        3. 인스턴스의 생명주기 관리 : 클래스 자체가 인스턴스 생성을 관리하므로, 다른 객체들이 직접 인스턴스를 생성하거나 폐기 할 수 X

    싱글톤 패턴의 장점
        1. 메모리 절약 : 불필요한 인스턴스 생성을 방지하여 메모리르 절약할 수 있음.
        2. 글로벌 (전역적) 접근 : 전역적으로 접근할 수 있기 때문에 접근에 용이 -> 하지만 접근 자체는 단점
        3. 일관성 유지 : 애플리케이션 전반에서 하나의 인스턴스만 사용하기 때문에 상태 일관성을 유지

        단점
        1. 테스트 어려움 : 싱글톤 패턴은 전역적으로 사용되므로 단위 테스트가 어려울 수 있음.
        2. 의존성 숨김 : 싱글톤을 남용하면 클래스 간의 의존성을 추적하기 어려울 수 있음 -> 신중히 사용바람.
 */

public class FactoryMain {
    public static void main(String[] args) {
        Factory factory1 = new Factory("1공장");
        Factory factory2 = new Factory("2공장");
        Factory factory3 = new Factory("3공장");
        Factory factory4 = new Factory("4공장");


        SmartPhone smartPhone1 = factory1.produceSmartPhone();  // Factory.class 에 있는 메서드를 가져와서 선언함.
        SmartPhone smartPhone2 = factory2.produceSmartPhone();
        SmartPhone smartPhone3 = factory3.produceSmartPhone();
        SmartPhone smartPhone4 = factory4.produceSmartPhone();

        // smartPhone1 의 경우 SmartPhone 클래스의 객체인데 (참조자료형),왜 sout(smartPhone1) 을 했는데 주소 값이 아니라 필드가 나옴?
        // -> SmartPhone 클래스의 @ToString 애너테아션 때메
        System.out.println(smartPhone1);
        System.out.println(smartPhone2);
        System.out.println(smartPhone3);
        System.out.println(smartPhone4);
    }
}
