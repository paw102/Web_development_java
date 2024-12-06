package ch02_variable;
/*
    variable 패키지 생성 -> 패키지 우클릭 새로 만들기 -> Java class 클릭 -> Ch02.java
 */
public class Ch02 {
    public static void main(String[] args) {
        /*
            변수(variable) : 데이터를 담을 수 있는 바구니
         */
        //1. 논리 자료형 변수 : 참 / 거짓
//        boolean checkFlag = false; // or true
//        //자료형 변수명 = 데이터; -> 변수 선언 및 초기화
//        System.out.println(checkFlag);
//        //Java에서의 변수 표기법 -> 카멜 표기법 (Cammel Case)
//        //첫 문자는 소문자로, 복수의 단에 결합되는 경우는 대문자로
//        //두번째 단어의 첫번째 문자는 대문자로 표기함
//        //ex) String example;
//        //ex) String exampleOfKorean;
//        checkFlag =true; //변수에 데이터 재대입
//        System.out.println(checkFlag);
//        //checkFlag2 = true; //오류 발생 (자료형을 선언하지 않았기 때문)
//        boolean checkFlag3;  // 변수 선언 -> 자료형 변수명;
//        checkFlag3 = true; //변수에 값을 최초로 대입하는 것을 초기화라고함.
//        //최초로 변수를 선언할 떄 자료 형을 명시하고 값을 대입하여 초기화함.
//        //추후 해당 변수에 값을 재대입 하는 경우에는 변수 명 = (바뀐) 값; 형태로 작성함.
//
//
//        //2. 문자 자료형 변수
//        char name1 = '박'; //문자를 입력할 때는 작은 따옴표('')로 나눈다.
//        char name2 = '수'; //문자(Character) : 알파벳 / 한글 / 숫자 하나
//        char name3 = '빈';
//
//        System.out.println(name1);
//        System.out.println(name2);
//        System.out.println(name3);
//        System.out.println(name1 + name2 + name3); // 복수의 문자들이 표기된 주소값이 출력됨
//        System.out.println("" + name1 + name2 + name3); //java의 sout의 경우 맨 앞의 자료형을 따라감.
//        //즉, 큰 따옴표로 시작했을 경우 () 내에 있는 전체 자료형을 문자열로 보기 때문에 "박수빈" 전체가 출력됨.
//
//        /*
//            문제:
//            name1,2,3 에 이름 한 글자씩 재대입한 후에
//            sout을 통해서 콘솔창에 이름이 출력될 수 있도록 작성하시오.
//         */
//        //name1,2,3 에  강사님 이름을 한 글자씩 재대입하는 과정
//        //변수명 = 바꿀 값;
//        name1 = '안';
//        name2 = '근';
//        name3 = '수';
//        //2. 각 문자열들을 합쳐서 문자열로 출력하는 방법
//        System.out.println("" + name1 + name2 + name3 + " 강사님");

//        //3. 정수 자료형 변수
//        int width1 = 100;
//        int width2 = 200;
//        System.out.println(width1);
//        System.out.println(width2);
//        System.out.println(width1 + width2); // 숫자라는 연산이 가능 -> Ch01에서 함
//
//         String width3 = "300";
//         String width4 = "400";
//        System.out.println(width3 + width4); // 문자끼리는 연산이 안되고, 나열만 가능함 -> ch01
//        System.out.println(width1 + width3); // 정수 + 문자열 ==> 문지열로 나열
//        System.out.println(width4 + width2); // 문자열 + 정수 ==> 문자열로 나열
//
//
//        //java 버전 17 이후 기능 : 여러 줄에 걸친 데이터들을 변수에 대입 가능함. 큰따옴표 3개로 선언 후 사용 가능함.
//        String introduction = """
//                박수빈
//                소프트웨어학과
//                대학교 2학년 재학 중
//                ISFP
//                """;
//        System.out.println(introduction);
//        /*
//            문제
//             String introduction2 를 선언 후 아까와 같이 데이터를 문자열들로 나열 후 출력
//         */
//
//        String introduction2 = """
//                가족 구성원
//                5명
//                2남 1여 존재
//                각각 대학교 대학교 고등학교 재학중
//                """;
//        System.out.println(introduction2);

        //3-2.
//        int longNum = 13214141341343413415; // -> int 가 허용되는 범위 값에서 벗어난 값이므로 오류 발생
//        System.out.println(longNum);

        long time = System.currentTimeMillis();
        System.out.println(time);

        /*
        int(4바이트, 32비트)
            최소값 : -2^31 (약 21억)
            최대값 : 2^31 - 1 (약 21억)
        long(8바이트, 64비트)
            최소값 : -2^63 (약 ???)
            최대값 : 2^63 - 1 (약 ???)
         */

//        //4. 실수 자료형 변수
//        double pi = 3.14159;
//        System.out.println(pi);
//
//        double dotZero = 3;
//        System.out.println(dotZero);

//        //5. 상수
//        //final 자료형 변수명 = 데이터
//        //상수의 경우에는 변수를 대문자로 작성함.
//        final String lowerCaseVariable = "소문자의 변수명"; // 오류 X -> 1) 참조
//        System.out.println(lowerCaseVariable);
//        final String EXAMPLE_OF_FINAL;
//        EXAMPLE_OF_FINAL = "이것이 예시 입니다."; // 상수의 선언
//        System.out.println(EXAMPLE_OF_FINAL); // 초기화 및 출력 -> 2) 참조
//        EXAMPLE_OF_FINAL = "이렇게 바꾸겠습니다."; 오류 발생
//        System.out.println(EXAMPLE_OF_FINAL);

        /*
            상수의 특징:
            1) 개발자들끼리의 약속으로 상수는 전체 대문자로 작성하고 단어사이의 경계를 '_' 로 표시함.
            2) 한 번의 선언 및 초기화가 가능함
            3) 2)의 이유로 재대입이 불가능함.
         */
    }
}
