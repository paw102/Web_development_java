package ch09_classes;

public class CarMain {
    public static void main(String[] args) {
//     //클래스명 객체명 = new 클래스명() (변수처럼 한꺼번에 선언가능함);
//        Car myCar = new Car();
//        Car yourCar = new Car();

        Car myCar = new Car();
        myCar.color = "빨강"; //myCar. 찍으면 자동완성으로 f color 로 나오는데 field 의 축약어임.

        Car yourCar = new Car();
        yourCar.color = "노랑";

        myCar.drive(); //myCar. 찍으면 자동완성으로 m drive로 나오는데, method 의 축약어임.
        yourCar.stop();
    }
}
