package ch19_generic.wildcards.wildcards_practice;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Car {
    private String model;

    //  만약 논리적인 상속 관계를 무시하고 AnimalData 에서 Car 의 객체를 생성하고 싶다면
    //  public class Car extends Animal 로 작성 한 후
    //  move() 메서드를 오버라이드 하면 가능하긴함.

//    @Override
//    public void move() {
//        System.out.println("차가 굴러갑니다.");
//    }
}
