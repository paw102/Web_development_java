package ch06_condition;

import java.util.Scanner;

public class Condition01 {
    public static void main(String[] args) {
        /*
            if문 -> 조건식을 제시하고, 그것이 참이라면 중괄호({}) 내의 실행문을 실행함.
            아닐 경우에는 else if 혹은 else 를 사용 할 수도 있음.

            형식 :
            if(조건문){            //조건문 : true / false 로 결론나는 문장
                실행문
            }
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요. >>> ");
        int num = scanner.nextInt();

        // 1) if 만 사용했을 때의 예제
//        if (num > 0) {
//            System.out.println("num은 양수입니다.");
//        }

//        // 2) if - else 구조 예제
//        if (num >= 0) {
//            System.out.println("num은 양수입니다.");
//        } else {    // else는 if 가 false 일 때 실행되는 최종 조건문이므로 조건식이 포함되지 않음.
//                    // num이 0 미만인 경우 -> num < 0
//            System.out.println("num은 음수입니다.");
//        }
        // 3) if - else if - else 구조의 예제
        if (num > 0) {
            System.out.println("num은 양수입니다.");
        } else if (num == 0) {     // if문의 조건식이 false 일 경우 차후 조건 : 순서가 중요함.
            System.out.println("num은 0입니다.");
        } else{
            System.out.println("num은 음수입니다.");
        }
    }
}
