package ch15_casting.centralcontrol;

public class Main {
    public static void main(String[] args) {
        // 각 클래스의 객체 생성
        Computer computer1 = new Computer();
        Tv tv1 = new Tv();
        Speaker speaker1 = new Speaker();
        LED led1 = new LED();
        Mouse mouse1 = new Mouse();

        CentralControl centralControl = new CentralControl(new Power[5]);
        // 마찬가지로 new CentralControl 생성자의 argument 로 다시 생성자인데 -> 그마저도 배열
        // computer1은 0번지
        // led1 은 1번지
        // speaker1 은 2번지
        // tv1 은 3번지에 각각 CentralControl 의 객체 내의 배열에 집어넣기
        centralControl.addDevice(computer1);
        centralControl.addDevice(led1);
        centralControl.addDevice(speaker1);
        centralControl.addDevice(tv1);
        centralControl.addDevice(mouse1);

        //  현재 코드를 작성한 바에 따르면 객체를 centralControl 에 추가했을 때만 콘솔창에 어떤 클래스의 객체가 추가되었는지 확인하는 것만
        //  가능한 상황임.

        // centralControl.displayInfo() 를 실행했을 때 콘솔창에 현재 배열에 들어가있는 요소들을 출력할 수 있도록 코드를 작성하시오.
        // centralControl.displayInfo2();
        // centralControl.displayInfo3();

        // 이상의 코드에서 생길 수 있는 문제점
        // displayInfo3 의 경우에는 배열 전체를 Arrays.toString() 을 이용하여 배열 자체를 출력할 수 있게끔 작성함
        // 이상의 경우 배열 내부에 있는 element 가 무엇이냐에 따라서 표기 방식이 다르게됨.
        // 예를 들어 배열 내부의 element 가 기본 자료형이라면 그 값이 그대로 String 으로 바뀌어서 쓰이게됨.
        // 현재와 같은 경우는 'Power 클래스의 서브 클래스의 객체' 가 element 이기 떄문에 참조 자료형이라 주소값이
        // String 으로 바뀌어서 코놋ㄹ에 출력되게 됨.

        // 배열의 각 요소들을 on ,off 시키기
        // 해당 경우 PowerOn() 메서드 내에 이미 반복문이 위치해 있기 때문에 powerOn() 하면 끝
//        centralControl.powerOn();
//        System.out.println("--------------------------\n");
//        centralControl.powerOff();

        // Mouse 클래스를 정의하고 Main 에서 객체 mouse1 을 생성
        // 배열에 집어넣고
        // 배열 내의 전체 객체들을 켜고 끄기

        // moust1 와 같은 객체를 배열 내부가 아니라 외부에서 그대로 고유 메서드로 활용 가능함.
        mouse1.leftClick();
        centralControl.performSpecificMethod();
    }
}
