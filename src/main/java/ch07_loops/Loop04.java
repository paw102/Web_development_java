package ch07_loops;

import java.util.Scanner;

public class Loop04 {
    public static void main(String[] args) {
        /*
            while 문

            형식 :
            while (조건문) {
                실행문
            }

            1 ~ 5 까지의 합을 구하는 for 문 작성
         */
//        int a = 0;
//        for(int i =0; i < 6; i++ ) {
//            a += i;
//        }
//        System.out.println(a);

//        int sum = 0;
//        int i = 0;
//        //while 문을 활용한 1 ~ 5 까지의 합 코드
//        while(i < 6) {
//            sum += i;
//            System.out.println(sum);
//            i++;        //i를 증가시켜서 무한루프에서 탈출시키고 합을 구하기 위함.
//        }
//        System.out.println("최종 합계 : " + sum);
//        System.out.println("i의 최종 값 : " + i);

        /*
            이상의 for문과 while 문에서 확인 할 수 있듯이
            for문의 경우 :
                한계값을 설정하기 때문에 정확한 반복의 횟수를 알 수 있음
                -> 따라서 반복 횟수를 고정시킬 수 있을 때 주로 사용함

            while문의 경우 :
                외부에서 변수를 선언한 다음에 강제로 증가시키는 편이기 떄문에
                횟수를 고려한 반복문에는 덜 적절함.
                대신, 특정 조건을 만족하는지 아닌지와 같이 횟수와 관계 없는 while 문이 사용됨.
         */
        Scanner scanner = new Scanner(System.in);
        int answer = 0;
        boolean continued = true;
        boolean endOfGame = false;

        // 범용적이고 읽기 쉬운 코드를 쓰기 위한 습관을 들이는 것이 중요함.
        // 하지만 해당 코드가 읽기 어려운 경우 또한 존재하기 때문에 이렇게도 쓸 수 있다는 것을 알려줌.
        while (!endOfGame) {
            System.out.print("계속하시겠습니까? >>> ");
            answer = scanner.nextInt();
            if(answer == 1) {
                endOfGame = true;
            }
        }

        while (continued) {
            System.out.print("계속하시겠습니까? >>> ");
            answer = scanner.nextInt();
            if(answer == 1) {
                continued = false;
            }
        }
    }
}
