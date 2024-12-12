package ch15_casting.centralcontrol;

public class Computer implements Power{

    @Override
    public void on() {
        System.out.println("컴퓨터 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("컴퓨터 전원을 끕니다.");
    }

    // 다운캐스팅을 위한 Computer 클래스만의 고유 메서드
    public void compute(){
        System.out.println("컴퓨터에서 계산을 수행합니다.");
    }
}
