package ch05_scanner;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        //import 명령어 가장 위에
        Scanner scanner = new Scanner(System.in);
        //사용되는 변수 그 다음에
        int year;

        System.out.println("윤년인지 확인하고자 하는 년도를 입력하시오 >>> ");
        year = scanner.nextInt();
        /*
            year 에 특정한 년도를 넣었을 때,
            해당 년도가 윤년이라면 true, 아니라면 false를 출력하는 프로그램을 작성하시오

            조건
            해당 year이 4의 배수이면 윤년,
            하지만 100의 배수이면 윤년이 아님.
            근데 또 400의 배수이면 윤년에 해당함.
         */

        boolean result = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
        System.out.println(year + "년은 윤년입니까? " + result);

    }
}
