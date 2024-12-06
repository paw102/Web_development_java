package ch04_operator;
/*
    package 명은 소문자로 작성하고 class 명은 대문자로(Pascal) 시작해야함.
 */
public class Operator01 {
    public static void main(String[] args) {
        //변수 선언 및 초기화
        int i = 10;
        System.out.println(i);
        //대입 연산자 : '=" -> 오른쪽의 데이터를 = 왼쪽의 변수에 대입한다는 의미
        i = i + 1;
        System.out.println(i);

        //복합 대입 연산자
        /*
            1) +=
            2) -=
            3) *=
            4) /=
         */
        int num = 1;
        System.out.println(num);
        num += 2;   //num = num + 2;
        System.out.println(num);
        num -= 1;   //num = num - 1;
        System.out.println(num);
        num *= 10;  //num = num * 10;
        System.out.println(num);
        num /= 5;   // num = num / 5;
        System.out.println(num);

        int j = 10;
        System.out.println(j);
        System.out.println(j++);    //변수++ : 코드를 실행시킨 '후'에 j 에 1을 더한 것
        System.out.println(j);
        System.out.println(++j);    //++변수 : 코드를 실행시키기 '전'에 j에 1을 먼저 더함
        System.out.println(j);
        System.out.println(--j);    //변수-- : 코드를 실행시킨 '후'에 j 에 1을 뺀 것
        System.out.println(j);
        System.out.println(j--);    //--변수 : 코드를 실행시키기 '전'에 j에 1을 먼저 뺌
        System.out.println(j);

        /*
            일반 수식 연산자
            + : 더하기
            - : 빼기
            * : 곱하기
            / : 나누기
            % : 나머지 연산자 : return 값은 무조건 int
         */
        System.out.println("10을 2로 나눈 나머지 : " + 10%2);
        System.out.println("10을 3으로 나눈 나머지 : " + 10%3);
    }
}
