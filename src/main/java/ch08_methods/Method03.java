package ch08_methods;

import java.util.Scanner;

/*
    Method02 중 if문으로 만든 방식이 가독성이 너무 떨어지기 때문에 동일한 기능을 하게끔 Refactoring 하는 과정
 */

public class Method03 {

    public static String getStar(int menuSelect, int totalLine) {
        String result = "";

        switch (menuSelect) {
            case 1:
                for (int i = 0; i < totalLine; i++) {
                    for (int j = 0; j < i + 1; j++) {
                        result += "*";
                    }
                    result += "\n";
                }
                break;

            case 2:
                for (int i = 0; i < totalLine; i++) {
                    for (int j = 0; j < totalLine - i - 1; j++) {
                        result += " ";
                    }   for (int k = 0; k < i + 1; k++) {
                        result += "*";
                    }
                    result += "\n";
                }
                break;

            case 3:
                for (int i = 0; i < totalLine; i++) {
                    for (int j = 0; j < totalLine - i; j++) {
                        result += "*";
                    }
                    result += "\n";
                }
                break;

            case 4:
                for (int i = 0; i < totalLine; i++) {
                    for (int j = 0; j < i; j++) {
                        result += " ";
                    }
                    for (int k = 0; k < totalLine - i; k++) {
                        result += "*";
                    }
                    result += "\n";
                }
                break;

            default:
                System.out.println("잘못된 입력입니다.");
                break;
        }
        return result;
    }
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        int rowOfStars;
        int choice = 0;


        System.out.println("1. 왼쪽으로 치우친 증가하는 별 ");
        System.out.println("2. 오른쪽으로 치우친 증가하는 별 ");
        System.out.println("3. 왼쪽으로 치우친 감소하는 별 ");
        System.out.println("4. 오른쪽으로 치우친 감소하는 별 ");
        System.out.print("메뉴 선택 : ");
        choice = scanner.nextInt();

        while (choice < 1 || choice > 4) {
            System.out.print("다시 메뉴를 선택하세요 >>> ");
            choice = scanner.nextInt();
        }

        System.out.print("별의 줄 수 입력 : ");
        rowOfStars = scanner.nextInt();

        System.out.println(" [ 호출하신 결과입니다 ] ");
        String stars = getStar(choice, rowOfStars);
        System.out.println(stars);
    }
}
