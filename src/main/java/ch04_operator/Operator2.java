package ch04_operator;

public class Operator2 {
    public static void main(String[] args) {
    /*
        -------논리 연산자-------
        true(1), false(0) : 컴퓨터가 읽을 수 있는 두 숫자
        boolean : true / false 를 구분하는 자료형

        AND(&&) : 논리곱 -> T x T = T, T x F = F , F x F = F => 하나라도 false라면 false
        OR(||) : 논리합 -> T + T = T , T + F = T , F + F = F => 하나라도 true라면 true
        NOT(!) : 부정 -> 값을 반대로 바꿔주거나 틀릴 경우를 나타냄 -> 추후 수업 예정
     */
        boolean flag1 = true;
        boolean flag2 = false;

//        System.out.println("-----------논리곱-----------");
//        boolean result1 = flag1 && flag1; // AND 연산자 활용 : 곱연산
//        System.out.println("T x T = " + result1);
//
//        boolean result2 = flag1 && flag2;
//        System.out.println("T x F = " + result2);
//
//        boolean result3 = flag2 && flag2;
//        System.out.println("F x F = " + result3 + "\n");
//
//        System.out.println("-----------논리합-----------");
//
//        boolean result4 = flag1 || flag1;
//        System.out.println("T + T = " + result4);
//(
//        boolean result5 = flag1 || flag2;
//        System.out.println("T + F = " + result5);
//
//        boolean result6 = flag2 || flag2;
//        System.out.println("F + F = " + result6);

        System.out.print("안녕하세요. \t 제 이름은"); // \t -> 2칸 혹은 4칸 띄어쓰기 (tab 띄어쓰기)
        System.out.print("\n박수빈입니다.\n"); // \n -> 개행(enter 키)

        boolean result7 = flag1 || flag2 && flag1;
        System.out.println("T + F  x T = " + result7);

        boolean result8 = 10%3 != 0; //'10 % 3의 결과값이 0이 아니면' 이라는 의미
        System.out.println("10 % 3 != 0 => " + result8);

        boolean result9 = 10%3 == 0; //'10 % 3의 결과값이 0이 이라면' 이라는 의미
        System.out.println("10 % 3 == 0 => " + result9);

        // == 은 자바에서 'a와 b가 같다' 라는 의미를 가짐'
    }
}
