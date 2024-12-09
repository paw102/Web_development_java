package ch13_inheritance;
/*
    Tiger.java 에서처럼
    생성자 및 setter / getter 를 작성하고 -> 상속 받은 상태에서 작성해야함.
    Animal 클래스의 move 메서드를 override 받아서 "두 발로 걷습니다." 를 출력할 수 있도록 '재정의' 하고
    Main.java 에서

   human1 객체를 생성하고 setter 를 이용, 내 이름과 나이를 입력하고
   human1.move() 메서드를 실행

   실행 예
   움직입니다.
   두 발로 걷습니다.
 */

public class Human extends Animal {
    public Human() {
        System.out.println("사람이 생성되었습니다. ");
    }

    public Human(String animalName) {
        super(animalName);
    }

    public Human(int animalAge) {
        super(animalAge);
    }

    public Human(String animalName, int animalAge) {
        super(animalName, animalAge);
    }
    // setter / getter / move 메서드 오버라이드


    @Override
    public String getAnimalName() {
        return super.getAnimalName();
    }

    @Override
    public void setAnimalName(String animalName) {
        super.setAnimalName(animalName);
    }

    @Override
    public int getAnimalAge() {
        return super.getAnimalAge();
    }

    @Override
    public void setAnimalAge(int animalAge) {
        super.setAnimalAge(animalAge);
    }

    @Override
    public void move(){
        super.move();

        System.out.println("두 발로 걷습니다. ");
    }
}
