package ch14_abstraction.interfaces;

public interface Up {
    // public void onUP();  -> 추상 메서드 쓸 때 이런식으로 했었는데 인터페이스에서는 상관 X -> interface 의 method 들은 모두 public 정의

    // 추상 메서드 선언
    void onUp();
}
