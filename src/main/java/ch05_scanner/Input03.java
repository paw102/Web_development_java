package ch05_scanner;

import java.util.Scanner;

public class Input03 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String name;
        int age;
        String address;
        String phone;
        /*
            이름을 입력하세요 >>> 박수빈
            나이를 입력하세요 >>> 24
            주소를 입력하세요 >>> 부산광역시 서구'
            연락처를 입력하세요 >>> 010-8283-6754

            사용자의 이름은 박수빈이고, 나이는 24살입니다.
            주소는 부산광역시 서구이며, 연락처는 010-8283-6754 입니다.
         */

        System.out.print("이름을 입력하세요 >>> ");
        name = scanner.nextLine();
        System.out.print("나이를 입력하세요 >>> ");
        age = scanner.nextInt();
        scanner.nextLine(); // 그래서 얘를 보호막으로 삼음
        System.out.print("주소를 입력하세요 >>> "); //.nextLine()을 제외한 모든 next 계열이 Input02 에서 배운 부분에 해당됨.
        address = scanner.nextLine();
        System.out.print("연락처를 입력하세요 >>> ");
        phone = scanner.nextLine();
        System.out.println();
        System.out.println("사용자의 이름은 " + name + "이고, 나이는 " + age + "살입니다.");
        System.out.println("주소는 " + address + "이며, 연락처는 " + phone + " 입니다.");

    }
}
