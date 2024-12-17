package ch19_generic;

import java.util.Date;
/*
    제네릭의 개념 및 정의
        제네릭은 클래스나 메서드가 다룰 데이터 타입을 미리 명시하여 재사용성과 유연성을 높이는 기술

        타입 매개변수 (Type Parameter) : 클래스나 메서드에서 사용할 실제 타입을 '대신하여' 사용하는 매개변수
                                        일반적으로 알파벳 대문자 한 글자로 표현함. 주로 T,E,K,V 등이 사용됨.

        1. T(Type) : 일반적으로 클래스의 타입을 나타낼 때 사용
        2. E(Element) : 컬렉션의 요소를 나타낼 때 사용
        3. K(Key) : 맵의 Key 를 나타낼 때 사용 -> 아직 수업 안함
        4. V(Value) : 맵의 값 (Value) 또는 제네릭 탕비의 반환값으로 사용 -> 아직 수업 안함.

        재사용성 : 제네릭을 사용하면 다양한 데이터 타입에 대해 하나의 클래스나 메서드를 정의할 수 있어 코드의 재사용성을 높이고 중복을 줄임.

        타입 안정성 (Type Safety) : 컴파일 시점에 타입 체크를 할 수 있어 프로그램의 안정성을 높이고, 명시적인 형변환을 줄임.
 */

public class DataController {
    public static void main(String[] args) {
        //  Date 클래스를 import 해서 now 객체 생성 -> 기본 생성자

        Date now = new Date();  // 자바 내장 클래스 이므로 따로 정의하지 않음.

        // <> 안에 앞으로 들어갈 타입을 미리 명시(제약) 할 수 있음.
        ResponseData<String> responseData1 = new ResponseData<>("날짜 저장 성공",now.toString());
        //  Data 클래스의 객체인 now 와 거기에 포함된 인스턴스 메서드 toString()
        //  이후 DataController.java 로 넘어감
        //  ResponseData 클래스를 확인해보면 T data 로 정의한 필드가 있는데 이를 main 단계에서 String 으로 정의함으로써
        //  data 가 될 수 있는 자료형은 String 만 가능하게 됨.
        System.out.println(responseData1);

        ResponseData<Integer> responseData2 = new ResponseData<>("번호 저장 성공", 123);
        System.out.println(responseData2);
        //  이상의 코드에서 제네릭에 <int> 형태로 쓸 수 없음.

        ResponseData<Date> responseData3 = new ResponseData<>("날짜 객체 저장 성공",now);
        System.out.println(responseData3);
        //  now는 객체라는 점을 9번 라인에서 확인 가능
        //  ResponseData 클래스에 @Data 를 입력했기 때문에 @ToString 이 포함돼 있음.
        //  따라서 now 가 출력이 가능함. 만약에 @Data 가 빠져있었다면 주소값만 출력될거임.
    }
}
