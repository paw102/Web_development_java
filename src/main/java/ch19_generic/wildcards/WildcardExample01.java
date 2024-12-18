package ch19_generic.wildcards;
/*
    1.와일드카드란 무엇인가?
        wildcard 는 제네릭 클래스나 메서드에서 어떤 특정 타입이 아닌 "어떤 타입" 도 받을 수 있는 유연성을 제공하는 기능
        자바에서 와일드카드는 물음표(?)로 표현되며, 이를 통해 특정 타입을 고정하지 않고 타입의 범위를 제한하거나 열어둘 수 있음.

    2. 와일드카드의 필요 이유
        1) 다양한 타입의 데이터를 처라하기 위해 제네릭 클래스나 메서드는 특정 타입에 제한적일 수 있음.
            와일드 카드를 사용하면 여러 타입에 대해 유연성을 제시 할 수 있음.
        2) 코드의 재사용성을 높이기 위해 와일드 카드를 사용하면 하나의 메서드로 다양한 타입의 데이터를
            처리할 수 있어 코드의 중복을 줄이고 유지보수를 쉽게 함.


    3. 와일드 카드의 종류
        1) 제한 없는 와일드 카드 (?)
            - 특정 타입을 제한하지 않고 모든 타입을 허용
            - 주로 데이터를 읽기만 할 때 사용
        2) 상한 제한 와일드카드 (? extends T)
            - 특정 타입 T 와 그 하위 타입만 허용
            - 데이터를 읽을 때는 안전한 편, 하지만 쓰는 작업에는 제약이 없
        3) 하한 제한 와일드카드 (? super T)
            - 특정 타입 T 와 그 상위 타입만 허용
            - 데이터를 쓸 때는 안전한 편, 하지만 읽는 작업에는 제약이 있음.

    4. 와일드카드의 한계
        1) 쓰기 작업 제한
            상한 제한 와일드카드 (? extends T) 는 리스트에 데이터를 추가할 수 없음.
        2) 명확한 타입을 보장하지 않음.
            와일드카드는 구체적인 타입을 알 수 없기 때문에 컴파일러가 타입 안정성을 완전히 보장하지 않음.
 */


import java.util.List;

public class WildcardExample01 {
    //  이하의 메서드가 매개변수로 List 타입을 받는데, List 내부의 요소의 자료형을 제한두지 않도록 와일드카드를 설정함.
    public static void printList(List<?> list) {
        // 리스트 내부의 요소를 뽑아볼 수 있는 반복문 작성
        // 자료형은 최상위 클래스인 Object 로 설정하여 리스트 내부의 요소 자료형이 무엇이든 출력할 수 있게끔 제한을 풀었음
        for (Object element : list){
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        List<String> stringList = List.of("Apple","Banana","Cherry");
        List<Integer> integerList = List.of(1,2,3,4,5);

        printList(stringList);
        printList(integerList);
    }
}
