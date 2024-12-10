package ch14_abstraction.interfaces;

public class VolumeDownButton extends Button{
    @Override
    public void onPressed(){
        System.out.println("볼륨을 내립니다.");
    }

    @Override
    public void onDown(){
        System.out.println("볼륨을 계속해서 내립니다.");
    }
}
