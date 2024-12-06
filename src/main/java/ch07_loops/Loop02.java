package ch07_loops;

import java.util.Scanner;

public class Loop02 {
    public static void main(String[] args) {
        /*
            기본 예제
            n에 숫자를 입력받아 몇 번 반복할 지 정하고 1부터 n까지 더하는 반복문을 작성하시오.

            실행 예
            몇 번 반복할 지 입력하세요 >>> 100
            합은 5050 입니다.
         */

        //1번 풀이
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int result = 0;
        System.out.print("몇 번 반복할 지 입력하세요 >>> ");
        n = scanner.nextInt();
        for (int i = 0; i < n+1; i++){
            result += i;
        }
        System.out.println("합은 " + result + " 입니다.");

//        //2번 풀이
//        for (int i = 0; i < n; i++){
//            result += i + 1;
//        }
//        System.out.println("합은 " + result + " 입니다.");
//
//        //3번 풀이
//        for (int i = 0; i <= n; i++){
//            result += i;
//        }
//        System.out.println("합은 " + result + " 입니다.");
    }
}
