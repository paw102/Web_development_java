package ch19_generic.wildcards;

import java.util.ArrayList;
import java.util.List;

//  하한 제한 와일드 카드
public class WildcardExample03 {
    public static void addNumbers(List<? super Integer> list){
        //  추가하는 갯수를 고정시킨 상태로 할거라 일반적인 for 문으로 작성할 것임.
        for (int i = 0; i < 6; i++) {
            list.add(i);    //  list 에 요소를 추가하는 메서드 .add

        }
    }

    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();
        addNumbers(numbers);

        System.out.println(numbers);    //  이 부분 또한 예전에 배운 Array 와 차이가 있음.

        //  List<? super Integer> 는 Integer 와 그 상위 타입 (ex) Number, Object) 만 허용
        //  데이터를 추가하는 것은 안전하지만, 읽을 때는 항항 Object 타입으로 반환됨.
    }
}
