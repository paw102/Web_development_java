package ch15_casting.centralcontrol;

import java.util.Arrays;

public class CentralControl {
    // 필드 선언
    private Power[] deviceArray;  // 필드를 배열로 선언한 경우가 처음이기 때문에 주목해서 봐야함.


    // 매개변수 생성자 생성
    public CentralControl(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }

    // Main 에 각 클래스의 객체들을 하나씩 생성하시오. -> centralControl 제외
    // 전자 제품들을 CentralControl 의 객체의 필드인 배열에 추가해주는 메서드
    public void addDevice(Power device) {
        // checkEmpty() 좀 있다가 정의 할 예정
        // 개발 환경에서는 만들다보면 추가적으로 메서드 구현이 필요한 경우가 있어 일부러 checkEmpty() 를 먼저 작성 후 addDivce() 하는 게
        // 아니라 지금과 같이 설정함.

        int emptyIndex = checkEmpty();  // checkEmpty() 의 리턴 값이 addDevice 에서 이용되는 '함수형 프로그래밍'
        if (emptyIndex == -1) {   // java 에서는 마이너스인덱스 개념이 없기 때문에 checkEmpty() 메서드에서 -1 을 반환시키는 이유는
            // 비어있는 배열이 없다는 의미이기 떄문에 다음과 같이 작성함.
            System.out.println("더 이상 장치를 연결할 수 없습니다.");
            return;
        }
        deviceArray[emptyIndex] = device;
        System.out.println(device.getClass().getSimpleName());
        //  객체명.getClass() -> 패키지 명을 포함한 클래스명이 출력됨
        //  객체명.getClass().getSimpleName() -> 클래스명만 출력
    }

    public int checkEmpty() {    // 비어있는 배열의 index 를 반환 할 것이기 때문에 그리고 그 비어있는 배열의 index 에 addDivce()
        // 를 통해 샤로운 전자 제품을 등록하는 방식으로 코딩 할 예정
        // 배열 내부를 탐색하여 비어있는 '첫 번째' 인덱스를 리턴 할 예정임.
        for (int i = 0; i < deviceArray.length; i++) {
            if (deviceArray[i] == null) {     // device[i] 에 값이 없다면
                return i;
            }
        }
        return -1;
    }

    //  배열 내부에 있는 elemetns 들의 전원을 전부 켜고 끄는 메서드를 구현
    public void powerOn() {
        // 배열 내부에 있는 요소들(객체들 - Power 의 자식 클래스)의 공통된 메서드인 .on() 을 실행시킬 예정
        // 해당 경우에 생겨날 수 있는 문제점 :
        //      특정 배열 인덱스 내에 아무 객체가 없다면 .on() 을 적용시킬 경우 컴파일 에러가 나기 때문에 해당 부분을 감안한 코드 작성
        for (int i = 0; i < deviceArray.length; i++) {
            if (deviceArray[i] == null) {
                // 특정 인덱스 넘버의 element가 null 값이라면
                continue; // 해당 반복문 파트는 종료하고 반복문 인덱스로 넝머가겠다는 의미
            }
            deviceArray[i].on();
            System.out.println();
        }
    }

    // 전원 버튼을 끄는 메서드 poweroff() 메서드를 구현하시오.
    public void powerOff() {
        // 반복문 돌면서 비어있으면 지나가고, 아니면 꺼야함.
        for (int i = 0; i < deviceArray.length; i++) {
            if (deviceArray[i] == null) {
                continue;
            }
            deviceArray[i].off();
            System.out.println();
        }
    }

    // 향상된 for문을 이용하여 powerOff2() 메서드를 구현하시오.
    public void PowerOff2(){
        // 자료형 객체명(변수명) : 반복가능객체(배열)
        for(Power device : deviceArray){       // deviceArray 라는 배열의 각 요소에 device 라는 객체명을 임시로 사용함.
            // null 이면 continue
            if(device == null){
                continue;
            }
            device.off();
        }
    }

    // displayInfo() 에 해당하는 메서드를 작성해야함. -> 배열의 요소를 하나씩 뽑아내는 것도 가능하고 배열 전체를 출력해도됨.
    // 코드 내부에 sout 을 구현하겠다는 의미
    public void displayInfo(){
        //  내부에 sout 구현
        // 배열이 가득차지 않았을 경우를 대비해야함.
        // 각 요소들을 하나씩 뽑게 될 예정인데 그 경우 null 값을 만나게 되면 컴파일 오류가 일어남
        // 배열 내부의 요소를 하나씩 뽑게 되는 방식을 구현해야함.
//        for (int i = 0; i < deviceArray.length; i++) {
//            if(deviceArray[i] == null){
//                continue;
//            } else {
//                System.out.println(i + " 번째 가전 "+ deviceArray[i] + "를 뽑아냄. ");
//            }
//        }
    }

    public void displayInfo2() {
        System.out.println("현재 연결된 장치");
        //  각 요소를 하나씩 뽑기 위한 반복문 작성
        for (int i = 0; i < deviceArray.length; i++) {
            // 혹시 null 이 있는 지 확인하기 위한 조건문 작성
            if(deviceArray[i] == null){
                System.out.println("슬롯 [ "+ i +" ] 이 비었음");
                continue;
            }
            System.out.println("슬롯 [ "+ i +" ] 번 " + deviceArray[i].getClass().getSimpleName());
        }
    }

    public void displayInfo3() {
        // 배열 전체를 출력하는 메서드
        System.out.println("현재 연결된 장치");
        // 배열의 주소값만 노출됨.
            System.out.println(Arrays.toString(deviceArray));
    }


    // 배열 내부를 돌면서 요소의 고유 메서드듣을 호출하는 예제 메서드
    public void performSpecificMethod(){
        for(Power device : deviceArray){
            if(device instanceof Computer) {
                // deviceArray 내부에 있는 요소라면 기본적으로 Power 인터페이스의 객체 (인터페이스는 상속 불가능) 이거나
                // 혹은 power 인터페이스를 상속 받은 클래스의 객체에 해당함
                // 이상의 코드는 배열 내부의 요소가 Computer 클래스의 인스턴스라면 다운캐스팅을 실행
                Computer computer = (Computer) device;  // 실행이 된다면 Computer 클래스로 다운캐스팅
                // 이제 객체명 computer 는 Computer 클래스의 인스턴스이므로 Computer 클래스에 정의된 고유 메서드로 실행 가능
                computer.compute();
            } else if (device instanceof Mouse) {
                Mouse mouse = (Mouse) device;
                mouse.leftClick();  // LED 클래스에 changeColor() 메서드를 정의하고  sout("색깔을 바꿉니다.") 라고 한 후
                                    // 다운캐스팅을 하시오.
            } else if (device instanceof LED) {
                LED led = (LED) device;
                led.changeColor();
            }   // 이상의 코드가 지시사항 2
        }
    }

}