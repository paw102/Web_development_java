package ch15_casting.centralcontrol;

public class Tv implements Power{
    @Override
    public void on() {
        // 재정의
        System.out.println("Tv 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("Tv 전원을 끕니다.");
    }

    /*
        Computer.java 도 이상과 같이 처리하고
        Speaker, LED 도 클래스를 만들어 위와 같이 만드시오.
     */

}
