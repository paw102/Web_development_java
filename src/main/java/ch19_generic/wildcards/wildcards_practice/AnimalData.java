package ch19_generic.wildcards.wildcards_practice;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class AnimalData<T> {
    private T animal;       //  Main.java 와 비교했을 때 결과적으로 <? extends Animal> 이 적용됐다면
                            //  animal 에 들어갈 수 있는 것은 Human 혹은 Tiger 클래스의 인스턴스 밖에 없음

    public void printData(){
        ((Animal) animal).move();   //  T이기 때문에 Object 클래스의 객체가 들어올 수 있는데 명시적 다운캐스팅을 통해서
                                    //  Animal 클래스의 인스턴스로 animal 이 바뀜 -> .move() 사용 가능
        if (animal.getClass() == Human.class){  //  AnimalData 의 필드(animal)는 이상의 코드로 인해 Animal 클래스의 객체임
            ((Human) animal).readBooks();       //  근데 그 Animal 이 Human 클래스의 인스턴스라면 readBooks() 호출
        } else if (animal.getClass() == Tiger.class) {  //  animal을 Tiger 클래스로 명시적인 다운캐스팅 하여 .hunt() 호출
            ((Tiger) animal).hunt();
        }

    }
}
