package ch07_loops;

import java.util.Scanner;

public class Loop03 {
    public static void main(String[] args) {
        /*
            중첩 for 문 (multiple for sentence)
            형식 :

            for(int i = 0; i < 10; i++) {
                (실행문1)      -> () 선택적인 실행문임. 있어도 되고 없어도 되고
                for(int j = 0; j < 10; j++){
                    실행믄2
                }
                (실행문3)
            }
         */

        //모든 실행문을 다 써 본 예시
//        int a = 0;
//        int b = 0;
//        for (int i = 0; i < 10; i++){
//            a = i;
//            System.out.println("a의 값 : " + a);
//            for (int j = 0; j < 10; j++){
//                b = j;
//                System.out.println("b의 값 : " + b);
//            }
//            System.out.println("-------a의 값이 바뀌는 지점입니다.--------");
//        }
//        System.out.println("반복 종료");
        /*
            숫자 하나를 입력 받아, 그 숫자에 해당하는 구구단을 출력하시오.

            실행 예
            숫자를 입력하세요 >>> 2
            2 x 1 = 2
            2 x 2 = 4
            ...
            2 x 9 = 18
         */

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("숫자를 입력하세요 >>> ");
//        int dan = scanner.nextInt();
//        // 반복문 작성
//        for (int i = 1; i < 10; i++){
//            int result = dan * i;
//            System.out.println(dan + " x " + i  + " = " + result);
//        }

        /*
            구구단 출력

            실행 예
            2 x 1 = 2
            2 x 2 = 4
            ...
            2 x 9 = 18
            ---------------------
            9 x 8 = 72
            9 x 9 = 81
            ---------------------
         */
        //2단부터 시작하기 때문에 int i = 2로 선언 및 초기화
        for (int i = 2; i < 10; i++) {
            //실행문1 없음
            for (int j = 1; j < 10; j++) {
                //실행문2
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println("---------------------");
        }
    }
}
