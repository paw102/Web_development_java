package ch09_classes;

import java.util.Scanner;

public class ConstructorMain {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
//        Constructor constructor0 = new Constructor();    // 기본 생성자는 자동 생성되기 때문에 정의하지 않아도 된 경우
//
//        //constructor0 의 필드에 값 대입
//        constructor0.num = 38;
//        constructor0.name = "안근수";
//
//        //매개변수 생성자1 을 사용허여 생성
//        Constructor constructor1 = new Constructor(120);
//
//        // 나의 이름과 나이를 constructor1 에 대입
//        constructor1.num = 24;
//        constructor1.name = "박수빈";
//
//        System.out.println(constructor0.num);
//        System.out.println(constructor0.name);
//        System.out.println("-----------------------");
//        System.out.println(constructor1.num);
//        System.out.println(constructor1.name);
//
//        System.out.println("-----------------------");
//        System.out.println("20241203 수업 시작 부분");
//
            int age;
//        String name;
//
//        Constructor constructor2 = new Constructor(); // 기본 생성자를 통한 객체의 생성
//        System.out.print("당신의 나이를 입력하세요 >>> ");
//        constructor2.num = scanner.nextInt();
//        scanner.nextLine(); //  nextInt() 쓰는 바람에 enter 누르면 넘어감 -> nextLine() 삽입하여 보호
//        System.out.print("당신의 이름을 입력하세요 >>> ");
//        constructor2.name = scanner.nextLine();
//
//        System.out.println("당신의 이름은 " + constructor2.name + " 이고\n당신의 나이는 " + constructor2.num + " 입니다.");

//        // 위에서 name 변수와 age 변수를 사용해서 직접 생성자를 만든다면,
//        // 사전에 입력 받은 데이터를 매개 변수 생성자의 argument 로 사용한 방식
//        System.out.print("당신의 나이를 입력하세요 >>> ");
//        age = scanner.nextInt();
//        Constructor constructor3 = new Constructor(age);
//        System.out.println(constructor3.num);

//        Constructor constructor4 = new Constructor("김일");
//        constructor4.num = 20;
//        System.out.println(constructor4.name);
//        System.out.println(constructor4.num);

        //Constructor(int num, Stirng name) 을 이용한 객체 생성
        Constructor constructor5 = new Constructor(21, "김이");
        System.out.println(constructor5);
        constructor5.showInfo();

        System.out.println(constructor5.toString());
    }
}
