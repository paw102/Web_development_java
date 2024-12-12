package ch16_object_classes;
/*
    toString(), equals(), hashCode()

    1. toString() : 객체의 문자열 표현
        기본적으로 모든 클래스는 Object 클래스를 상속받으며, Object 의 toString() 메서드는 클래스 이름과 해시코드를 반환함.
        -> 이를 Override 를 통해서 재정의해서 사용하는 편

        왜 사용하는가? : 읽기 편해서 ㅋ

    2. equals() : 객체의 동등적 표현
        두 객체가 '논리적으로 같은 지' 를 비교하는 메서드
        기본적으로 object 클래스의 equals() 메서드는 두 객체의 참조 주소를 비교함
        형식 :
            객체명1.equals(객체명2)       -> 객체명1과 객체명2 의 참조 주소가 동일한 지 확인

    3. hashCode() : 객체의 고유 값
        객체를 정수 값 (해시값) 으로 반환
        해시값은 주로 해시 기반 컬렉션에서 사용됨 (Collections 파트에서 hashMap, hashSet 개념을 배울 때 언급 예정)
        equals() 를 override 하면 hashCode() 도 반드시 'override' 해야함.
            - 동일한 객체 (equals() == true) 는 동일한 해시 코드를 가져야만 하기 때문인데, 문제는 해시코드가 같다고해서
            - 항상 equals() 가 ture 인 것은 아니라는 점임.
 */

public class Student {

}
