package ch08_methods;

import java.util.Scanner;

public class Method02 {
/*
    main 메서드에서 메뉴로 정의한 1~4까지의 별찍기 메서드 구현
 */
    public static String getStar(int menuSelect, int totalLine) {
        String result = "";

        // 번호 (menuSelect) 의 값에 따라 다른 반복문이 실행되야 함.
        if(menuSelect == 1){
            //왼쪽으로 치우친 증가하는 별
            for (int i = 0; i < totalLine; i++) {
                for (int j = 0; j < i + 1; j++) {
                    result += "*";
                }
                result += "\n";
            }
        } else if(menuSelect == 2) {
            // 오른쪽으로 치우친 증가하는 별
            for (int i = 0; i < totalLine; i++) {
                //공백 삽입하는 실행문 2-1
                for (int j = 0; j < totalLine - i - 1; j++) {
                    result += " ";
                }
                // 별 찍는 실행문 2-2
                for (int k = 0; k < i +1; k++) {
                    result += "*";
                }
                //개행하는 실행문3
                result += "\n";
            }
        } else if (menuSelect == 3) {
            for (int i = 0; i < totalLine; i++) {
                for (int j = 0; j < totalLine - i; j++) {
                    result += "*";
                }
                result += "\n";
            }
        } else if (menuSelect == 4) {
            //오른쪽으로 치우친 감소하는 별 1
            for (int i = 0; i < totalLine; i++) {
                // 공백을 삽입하는 실행문 2-1
                for (int j = 0; j < i; j++) {
                    result += " ";
                }
                //별을 삽입하는 실행문 2-2
                for (int k = 0; k < totalLine - i; k++) {
                    result += "*";
                }
                //개행하는 실행문3
                result += "\n";
            }
        } else {
            System.out.println("잘못된 입력입니다.");
        }

        return result;
    }

    public static void main(String[] args) {
        // 별찍기를 메서드 형태로 구현
        // 사용할 클래스 import
        Scanner scanner = new Scanner(System.in);
        // 사용 할 변수 선언
        int rowOfStars;
        int choice = 0;

        // 사용자 경험에 불편한 코드
//        System.out.print("별의 줄 수 입력 : ");
//        rowOfStars = scanner.nextInt();

        System.out.println("1. 왼쪽으로 치우친 증가하는 별 ");
        System.out.println("2. 오른쪽으로 치우친 증가하는 별 ");
        System.out.println("3. 왼쪽으로 치우친 감소하는 별 ");
        System.out.println("4. 오른쪽으로 치우친 감소하는 별 ");
        System.out.print("메뉴 선택 : ");
        choice = scanner.nextInt();

//        // 4 초과로 입력했을 경우에만 이하의 코드가 실행됨
//        if (choice > 4) {
//            System.out.print("다시 메뉴를 선택하세요 >>> ");
//            choice = scanner.nextInt();
//        }
//
//        // 1 미만으로 입력했을 경우에만 이하의 코드가 실행됨
//        if (choice < 1) {
//            System.out.print("다시 메뉴를 선택하세요 >>> ");
//            choice = scanner.nextInt();
//        }
//
//        // 비교 연산자로 개선
//        if (choice < 1 || choice > 4) {
//            System.out.print("다시 메뉴를 선택하세요 >>> ");
//            choice = scanner.nextInt();
//        }

        // 이상의 코드 문제점은 choice 가 범위를 벗어났을 때 한 번만 실행됨
        while (choice < 1 || choice > 4) {
            System.out.print("다시 메뉴를 선택하세요 >>> ");
            choice = scanner.nextInt();
        }

        System.out.print("별의 줄 수 입력 : ");
        rowOfStars = scanner.nextInt();


        //이하에서 메서드를 실행 -> 문제점 : 5 이상을 입력했을 때, 메서드가 이미 호출됨.
//        String stars = getStar(choice, rowOfStars);
        // 사용성 개선을 위해서 위로 이동
        System.out.println(" [ 호출하신 결과입니다 ] ");
        String stars = getStar(choice, rowOfStars);
        System.out.println(stars);
    }
}
