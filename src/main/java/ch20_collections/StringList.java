package ch20_collections;

import ch19_generic.wildcards.wildcards_practice.Human;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
    1. Java Collection FrameWork 란?
        자바에서 데이터를 효율적으론 저장하고 관리하기 위한 자료구조와 알고리즘을 제공하는 라이브러리
        컬렉션 프레임워크를 사용한다면 다양한 자료구조를 쉽게 구현하고 데이터를 추가, 삭제, 정렬 및 검색 등의 작업을 간편하게 수행 가능

    2. 컬렉션의 주요 특징
        1) 데이터의 저장 및 관리
            - 컬렉션은 데이터(객체)를 저장하고 조작 (추가, 삭제, 검색, 정렬) 하는데 사용
        2) 유연성과 재사용성
            - 다양한 자료구조 (list, map, set etc) 를 지원하므로 목적에 맞게 사용 가능
        3) 제네릭 지원
            - 타입 안정성을 제공하며 명시적 형변환이 필요 없음.
        4) 표준 인터페이스 제공
            - 컬렉션은 공통 인터페이스 (List, Set, Map) 을 통해 일관된 프로그래밍 방식을 제공

    3. Java Collection 구조
        컬렉션 프레임워크는 크게 세 가지 주요 '인터페이스' 를 중심으로 구성됨.
        1) List
            - 중복을 허용 / 순서가 있는 데이터를 저장
            - 구현체 : ArrayList, LinkedList, Vector, Stack
        2) Set
            - 중복을 허용하지 않으며, 순서가 '없는' 데이터를 저장
            - 구현체 : HashSet, LinkedHashSet, TreeSet
        3) Map
            - 키 (Key) 와 값 (Value) 의 쌍으로 데이터를 저장
            - 키는 중복을 허용하지 않지만 값은 중복이 가능
            - 구현체 : HashMap, LinkedHashMap, TreeMap, HashTable

         이후 부분은 List 는 StringList.java 에, Set 은 StringSet.java 에서 서술

    List - 데이터를 순차적으로 저장하며, index 를 사용해 element 를 관리
         - 중복 데이터를 허용

         구현체 :
         ArrayList : 내부적으로 배열을 사용하며, 조회 속도가 빠름
         LinkedList : 내부적으로 노드 구조를 사용하며, 삽입 / 삭제가 빠름
 */
public class StringList {
    public static void main(String[] args) {
        //  List 인터페이스의 구현체 ArrayList 를 생성 및 초기화
        List<String> strList = new ArrayList<>();

        //  List 데이터 삽입
        strList.add("Java");        // list 는 .add() 메서드를 통해 하나씩 요소를 삽입함.
        strList.add("Python");
        strList.add("C#");
        strList.add("JavaScript");
        strList.add("Kotlin");

        //  List 의 출력 - Arrays.toString() 을 쓸 필요 없
        System.out.println(strList);

        //  특정 문자열 검색
        //  이 부분에서만 쓸거라 여기에 Scanner import
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("검색할 요소 입력 : ");
        // 여기서 사용할 변수 하나 선언 및 초기화
        String searchStr = "Python";
        boolean contains = strList.contains(searchStr);
        System.out.println(searchStr + " 포함 여부 : " + contains);

        //  이상의 특정 문자열 검색에서 중요한 점은 List 요소의 '전체 문자열' 을 확인하기 때문에 일부 문자열로는 검색이 불가능함.
        String searchStr2 = "Py";
        boolean contains2 = strList.contains(searchStr2);
        System.out.println(searchStr2 + " 포함 여부 : " + contains2);

        //  요소를 더하는 메서드는 .add() / 포함하는지 여부를 확인하는 메서드는 .contains()

        //  특정 문자열 삭제
        String removeStr = "C#";
        boolean removed = strList.remove(removeStr);
        System.out.println(removeStr + " 삭제 여부 : " + removed);
        System.out.println("삭제 후 전체 리스트 " + strList);


        String removeStr2 = "Py";
        boolean removed2 = strList.remove(removeStr2);
        System.out.println(removeStr2 + " 삭제 여부 : " + removed2);
        System.out.println("삭제 후 전체 리스트 " + strList);
        //  검색과 마찬가지로 일부 문자열로는 Py 가 포함된 요소가 삭제된다거나, 혹은 Py 문자열이 삭제 되었기 때문에
        //  thon 만 남는다거나 하는 일은 없음

        //  List 의 특정 인덱스 요소 출력
        System.out.println(strList.get(0));     // .get(인덱스넘버) 를 통해 조회 가능

        //  List 정렬
        Collections.sort(strList);  // 여기서 이미 정렬이 완료됨. -> 재대입 할 필요 없
        System.out.println("정렬 이후 리스트 : " +  strList);
        System.out.println("--------------------------------------------------------------");

        // List 역순 정렬
        Collections.sort(strList, Collections.reverseOrder());
        System.out.println("역정렬 이후 리스트 : " + strList);

        // List 의 요소를 하나씩 뽑는 반복문
        for (String element : strList){
            System.out.println(element);
        }

        //  일반 for 문    -> 배열의 경우 .length 이지만 리스트의 경우 .size() 사용
        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }
    }
}
