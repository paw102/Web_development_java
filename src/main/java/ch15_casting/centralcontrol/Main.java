package ch15_casting.centralcontrol;

public class Main {
    public static void main(String[] args) {
        // 각 클래스의 객체 생성
        Computer computer1 = new Computer();
        Tv tv1 = new Tv();
        Speaker speaker1 = new Speaker();
        LED led = new LED();

        CentralControl centralControl = new CentralControl(new Power[5]);
        // 마찬가지로 new CentralControl 생성자의 argument 로 다시 생성자인데 -> 그마저도 배열
    }
}
