package ch14_abstraction.interfaces;
/*
    인터페이스는 일반 클래스와 달리 다중 상속이 가능하다고 수업했음.
    때문에 일반 클래스의 상속과 명령어 또한 다름
    extends(일반 클래스 상속시) / implements (인터페이스 상속시)
 */

public class Button implements  Press, Up, Down{

    @Override
    public void onDown(){};

    @Override
    public void onPressed(){};

    @Override
    public void onUp(){};
}
