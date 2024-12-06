package ch12_arrays;
/*
   여태까지 배운 자바 자체 클래스

   Scanner
   Random
   Arrays
   Integer
   Comparator

   Math.random() 메서드
   Java에서 난수를 생성하기 위해 Math.random() 매서드를 사용할 수 있음
   0.0 ~ 1.0 미만의 난수를 변환

   1. index 가 10개인 배열을 만들고 Math.random() 을 이용하여 값을 넣으시오. -> 1 ~ 10 까지의 int 배열을 만들 것
   2. 값이 입력된 배열을 출력할 것
   3. 해당 배열의 합을 구할 것
   4. 짝수만 추출해서 합을 구할 것

 */

import java.util.Arrays;

public class ArrayTest04 {
    public static void main(String[] args) {
//        double a = Math.random();
//        System.out.println(a);
//
//        // 이상의 메서드를 응용해서 0~9 까지의 int 가 출력되도록 작성
//        int b = (int)(Math.random()*10);
//        System.out.println(b);
//
//        // 이상의 메서드를 응용해서 1~10 까지의 int 가 출력되도록 작성
//        int c = (int)(Math.random()*10)+1;
//        System.out.println(c);

//        // 1. 사용할 변수 선언
        int[] arr1 = new int[20];
        int sum = 0;
        int sumEven = 0;
//        // 2. 출력 할 반복문 작성
//        // 3. 합 구하는 반복문 작성
//        for (int i = 0; i < arr1.length; i++) {
//            arr1[i] = (int)(Math.random()*10)+1;;
//            sum += arr1[i];
//            if(arr1[i]%2 == 0){
//                sumEven += arr1[i];
//            }
//        }
//        // 4. 값이 입력된 배열을 출력 , sum 출력
//        System.out.println("[ 배열 출력 결과 ]");
//        System.out.println(Arrays.toString(arr1));
//        System.out.println("배열의 합 : " + sum);
//        System.out.println("배열 짝수의 합 : " + sumEven);

        // 이상에서 확인할 수 있듯이 반복문의 구조가 데이터 입력 당시 / 합을 구할 때 / 짝수의 합을 구할 때 똥일하다는 것을 알 수 있음.
        for (int i = 0; i < arr1.length; i++) {
            // 1. 데이터를 입력하는 부분
            arr1[i] = (int)(Math.random()*10)+1;
            // 2. 전체 합 구하는 부분
            sum += arr1[i];
            // 3. 짝수 합 구하는 부분
            if(arr1[i]%2 == 0){
                sumEven += arr1[i];
            }
        }
        System.out.println("[ 배열 출력 결과 ]");
        System.out.println(Arrays.toString(arr1));
        System.out.println("배열 전체 요소들의 합 : " + sum);
        System.out.println("배열 전체 요소들의 짝수 합 : " + sumEven);

    }
}
