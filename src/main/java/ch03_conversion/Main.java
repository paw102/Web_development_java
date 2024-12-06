package ch03_conversion;

public class Main {
    public static void main(String[] args) {
        // 데이터 타입의 변환 -> 용량 상의 문제로 일어나는 이슈를 해결하기 위해서
        char cast1 ='A';
        System.out.println("원형 : " + cast1);
        //형 변환을 하기 위해서는 (바꿀 데이터 타입) 변수명'을 작성한다.
        //upcasting(업케스팅) : 더 큰 용량의 자료형으로 변환시키는 것.
        //downcasting(다운케스팅) : 더 작은 용량의 자료형으로 변환시키는 것.
        System.out.println("변형 : " + (int)cast1 + "\n"); //ASCII 코드 치환 (1바이트 -> 2바이트)
        char cast2 = 'a';
        System.out.println("원형 : " + cast2); // 원형 : a 출력
        System.out.println("변형 : " + (int)cast2); // 변형 : 97 출력

        // 2) upcasting의 두번 째 방법
        char cast3 = 'b';
        // upcasting을 진행할 변수를 새로운 '자료형 변수형 = 기존 변수;' 형태로 작성
        int cast4 = cast3; // int 형 cast4 를 cast3 로 대입
        System.out.println(cast3);
        System.out.println(cast4);

        // 3) downcasting 방법
        int cast5 = 99;
        //방법1
        System.out.println((char)cast5);
        //방법2
        char cast6 = (char) cast5;
        System.out.println(cast6);
    }
}
