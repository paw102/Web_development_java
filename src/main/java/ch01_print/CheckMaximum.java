package ch01_print;

import java.util.Arrays;

public class CheckMaximum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(1250,2507,453,3203)));
    }

    // 유클리드 호제법 이용
    public static int gcd(int a, int b){
        boolean check = true;
        int temp;
        while (check) {
            temp = a % b;
            a = b;
            b = temp;
            if(temp == 0){
                check = false;
            }
        }
        return a;
    }

    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 분자 분모 계산
        int bunja = ((numer1*denom2)+(numer2*denom1));
        int bunmo = (denom1*denom2);
        // 두 값의 최대공약수 계산
        int divid = gcd(bunja, bunmo);

        //두 수를 나누기
        bunja /= divid;
        bunmo /= divid;
        int[] answer = {bunja, bunmo};
        return answer;
    }
}
