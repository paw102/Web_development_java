package ch14_abstraction.interfaces;

public class TemperatureDownBuntton extends Button{
    @Override
    public void onPressed(){
        System.out.println("온도를 내립니다.");
    }

    @Override
    public void onDown(){
        System.out.println("온도를 계속해서 내립니다.");
    }
}
