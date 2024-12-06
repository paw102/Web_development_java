/*
    intellij emmet 기능
    main 입력 후 스페이스 -> 메인 메서드 생성
    sout emmet -> sys.out.println 생성
    ctrl + d => 이전 코드 복붙기능
*/
package ch01_print;
/*
    ch01_print 패키지 생성
    ch01.java : Main이 들어갔다는 것은 해당 파일이 java 프로그램 실행 파일이 됨을 의미
 */

    /*
        다중 주석을 위한 명령어
     */

//무언가를 작성할 떄 주석 처리를 하고 싶을 때에는 / 두 번 사용
// 표현 할 문장을 주석 처리 하고싶을 때에는 ctrl + / 사용

public class ch01 {


    public static void main(String[] args) {
        System.out.println("Hello Java!");
        /*
            주석(comment) : 컴퓨터가 해당 부분은 컴파일링 하지 않고 사람이 읽을 수 있도록 하는 영역
         */

        /**
         *  클래스 혹은 메서드의 역할을 명시, 또는 설명하기 위한 주석
         */

        // 문자열(String)을 출력하기 위한 방법 -> 해당 문자열을 큰따옴표("")로 감싼다.
        // 문자열의 의미 -> 각 문자들의 합 -> 순서가 존재함

        System.out.println(123);
        System.out.println("123");
        System.out.println(123 + 4);
        System.out.println("123" + "4");
    }
}
