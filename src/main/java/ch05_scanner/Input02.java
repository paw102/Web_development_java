package ch05_scanner;

import java.util.Scanner;

public class Input02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x 입력: ");
        int x = scanner.nextInt();
        System.out.print("y 입력: ");
        int y = scanner.nextInt();
        System.out.println("x + y = " + (x+y)); // 괄호 안 연산 시행 후 문자열로 반환 (올바른 연산 출력)
        System.out.println("x + y = " + x+y); // "" 값을 먼저 취급받기 때문에 x,y 또한 문자열로 형 변환되어 그대로 연산됨
    /*
        평균 계산기를 작성하시오

        지시 사항
        1. 사용자로부터 세 개의 실수를 입력 받아, 이 숫자들의 평균 및 합을 계산하고 출력
        2. 사용자에게 첫 번째 실수를 입력받으시오.
        3. 사용자에게 두 번째 실수를 입력받으시오.
        4. 사용자에게 세 번째 실수를 입력받으시오.
        5. 총 합과 평균을 계산하고 출력하시오.

        실행 예
        첫 번째 실수를 입력하세요 >>>> 100
        두 번째 실수를 입력하세요 >>>> 80
        세 번째 실수를 입력하세요 >>>> 60

        평균 : 80.0
        총합 : 240.0

     */
        System.out.print("첫 번째 실수를 입력하세요 >>> ");
        double num1 = scanner.nextDouble();
        System.out.print("두 번째 실수를 입력하세요 >>> ");
        double num2 = scanner.nextDouble();
        System.out.print("세 번째 실수를 입력하세요 >>> ");
        double num3 = scanner.nextDouble();
        double result = (num1 + num2 + num3);
        System.out.println();
        System.out.println("평균 : " + result/3);
        System.out.println("총합 : " + result);

    }
}
