package ch19_generic.wildcards.wildcards_practice;

import lombok.ToString;

@ToString
public class Human extends Animal{
    @Override
    public void move() {
        System.out.println("사람이 두 발로 뜁니다.");
    }

    public void readBooks(){
        System.out.println("사람이 책을 읽습니다.");
    }
}
