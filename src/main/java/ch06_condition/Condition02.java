package ch06_condition;

import java.util.Scanner;

public class Condition02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
            else if는 여러 조건이 나올 수 있음 즉,
            if(조건식1){
                실행문1
            } else if (조건식2){
                실행문2
            } else if (조건식3){
                실행문3
            } else {
                실행문4
            }
            점수를 입력하면 점수대에 맞는 등급을 산출하는 프로그램을 작성하시오.
            100 ~ 90 : A
            89 ~ 80 : B
            79 ~ 70 : C
            69 ~ 60 : D
            59 이하 : F

            실행 예
            점수를 입력하세요 >>> 80
            당신의 등급은 B입니다.
         */

         /*1. 변수가 grade 하나인 버전
         조건식에는 변수로 시작하는 것이 권장됨.
         이상,이하보다는 초과,미만을 선호 ***
          */
//        System.out.print("점수를 입력하세요 >>> ");
//        int grade = scanner.nextInt();
//        if (grade <= 100 && grade >= 90 ) {
//            System.out.println("당신의 등급은 A입니다.");
//        } else if (grade <= 89 && grade >= 80 ) {
//            System.out.println("당신의 등급은 B입니다.");
//        } else if (grade <= 79 && grade >= 70 ) {
//            System.out.println("당신의 등급은 C입니다.");
//        } else if (grade <= 69 && grade >= 60 ) {
//            System.out.println("당신의 등급은 D입니다.");
//        } else {
//            System.out.println("당신의 등급은 F입니다.");
//        }
//
//        //강사님 답 : 내 답처럼 쓰면 쓸모없는 데이터를 낭비하게됨. if문은 아래로 하나씩 처리하는 방식이라 이미 비교값이 저장되어있기 떄문
//        if (grade > 89 ) {
//            System.out.println("당신의 등급은 A입니다.");
//        } else if (grade > 79 ) {
//            System.out.println("당신의 등급은 B입니다.");
//        } else if (grade > 69 ) {
//            System.out.println("당신의 등급은 C입니다.");
//        } else if (grade > 59 ) {
//            System.out.println("당신의 등급은 D입니다.");
//        } else {
//            System.out.println("당신의 등급은 F입니다.");
//        }
//
//        //score 변수 + grade 2개를 이용한 버전 -> 이 방식이 더 직관적으로 보기 편할 뿐더러 출력문 구조 상 if문에 하나씩 들여쓰는 건 적합하지 않음.
//        String score;
//        if (grade > 89 ) {
//            score = "A";
//        } else if (grade > 79 ) {
//            score = "B";
//        } else if (grade > 69 ) {
//            score = "C";
//        } else if (grade > 59 ) {
//            score = "D";
//        } else {
//            score = "F";
//        }
//        System.out.println("당신의 등급은 " + score + " 입니다.");


        //상수를 사용한 데이터를 제공했을 떄 이에 맞춰서 조건문을 작성하시오.
        final int VIP_POINT = 80;
        final int GOLD_POINT = 60;
        final int SILVER_POINT = 40;
        final int BRONZE_POINT = 20;

        int point;
        System.out.print("회원 포인트 점수를 입력하세요 >>> ");
        point = scanner.nextInt();

//        //변수 하나
//        if (point >= VIP_POINT){
//            System.out.println("당신의 포인트는 " + point + "점이고, 등급은 VIP 등급입니다.");
//        } else if (point >= GOLD_POINT){
//            System.out.println("당신의 포인트는 " + point + "점이고, 등급은 GOLD 등급입니다.");
//        } else if (point >= SILVER_POINT){
//            System.out.println("당신의 포인트는 " + point + "점이고, 등급은 SILVER 등급입니다.");
//        } else if (point >= BRONZE_POINT){
//            System.out.println("당신의 포인트는 " + point + "점이고, 등급은 BRONZE 등급입니다.");
//        } else {
//            System.out.println("당신의 포인트는 " + point + "점이고, 등급은 일반 등급입니다.");
//        }


        //변수 둘
        String grade;
        if (point >= VIP_POINT){
            grade = "VIP";
        } else if (point >= GOLD_POINT){
            grade = "GOLD";
        } else if (point >= SILVER_POINT){
            grade = "SILVER";
        } else if (point >= BRONZE_POINT){
            grade = "BRONZE";
        } else {
            grade = "일반";
        }
        System.out.println("당신의 포인트는 " + point + "점이고, 등급은 " + grade + " 등급입니다.");
        //실행 예
        //회원 포인트 점수를 입력하세요 >>> 17
        //당신의 포인트는 17점이고, 등급은 일반 (VIP, GOLD, SILVER, BRONZE) 등급입니다.
    }
}