package ch09_classes;
/*
    ClassA 에 적은 내용을 바탕으로 Car 클래스를 정의함.
 */

public class Car {
    //속성 (멤버 변수)
    String color;
    int speed;

    //행동 (메서드)
    void drive(){
        System.out.println("자동차가 주행 중 입니다.");
    }

    void stop() {
        System.out.println("자동차가 멈췄습니다.");
    }

    // 1. CarMain.java 로 가서 -> myCar 라는 객체를 생성하시오.
    // 2. myCar의 Color 에 "빨강" 을 대입하세요.
    // 3. yourCar 라는 개체를 생성하고 Color 에 "노랑" 을 대입하세요.
    // 4. myCar 에서 drive() 메서드를, yourCar 에서 stop() 메서드를 호출하세요.
}
