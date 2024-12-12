package ch15_casting.centralcontrol;

public class Speaker implements Power{

    @Override
    public void on() {
        System.out.println("스피커 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("스피커 전원을 끕니다.");
    }

    // 아직 다운캐스팅 코드 추가 전인 경우 예시  -> 혹시 복습 원한다면 centralControl 에 다운캐스팅하면됨.
    public void ChangeMod(){
        System.out.println("음색 모드르 바꿨습니다.");
    }
}
