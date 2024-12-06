package ch05_scanner;

import java.util.Scanner;



public class Input01 {
    public static void main(String[] args) {
    /*
         .nextInt() -> 입력값을 int로 고정해야함.
         .nextDouble() -> 입력값을 숫자로 쓰기만 하면 실수 형태로 전환함. ex) 1 -> 1.0
         .nextLine() -> 개행이 생기는 시점을 기준으로 String 데이터를 반환함.
         .next() -> 띄어쓰기를 포함하지 않는 String 데이터를 반환함.
     */


        //nextLine() 과 .next()를 비교 (주의점) + (중요)
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름을 입력하세요 >>> ");
        String name1 = scanner.next();
        //.next()를 쓰게 되는 경우 공백을 기준으로 데이터를 나누고, 그 후 enter 를 사용하게 되면
        //.nextLine() 에서 데이터를 입력받지 못하게됨. 이를 막아주기 위해 보호가 필요함.
        scanner.nextLine(); // enter 키를 한 번 막아주는 scanner 구문을 하나 작성을 꼭 해야함.
        String name2 = scanner.nextLine();
        System.out.println("당신의 이름은 : " + name1 + "," + name2);
    }



}
