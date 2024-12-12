package ch15_casting.centralcontrol;

public class LED implements Power{

    @Override
    public void on() {
        System.out.println("LED 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("LED 전원을 끕니다.");
    }

    // 지시사항 1번 -> CentalControl 로 넘어가기
    public void changeColor(){
        System.out.println("LED의 색깔을 바꿉니다.");
    }
}
