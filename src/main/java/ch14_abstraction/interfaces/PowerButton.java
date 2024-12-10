package ch14_abstraction.interfaces;
/*
    아까전에 Button 클래스의 경우에는 interface 를 상속 받음
    즉, press, up, down 이 가지고 있는 각각의 특징을 button 클래스에 모아놨다고 볼 수 있음
    이를 PowerButton, ChannelUpButton, ChannelDownButton 등으로 나누어 각각 Button 클래스를 상속하도록 작성 예정
 */

public class PowerButton extends Button{
    private boolean status;

    @Override
    public void onPressed() {
        if(status){
            status = false;
            System.out.println("전원을 끕니다.");
        } else {
            status =true;
            System.out.println("전원을 켭니다.");
        }
    }
}
