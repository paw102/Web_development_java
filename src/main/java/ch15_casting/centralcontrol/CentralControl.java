package ch15_casting.centralcontrol;

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
        }
    }
}