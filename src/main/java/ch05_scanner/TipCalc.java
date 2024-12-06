package ch05_scanner;

import java.util.Scanner;

public class TipCalc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*
            음식점에서 팁 계산하는 것을 원화 기준으로
            10%, 12%, 15% 중 하나를 선택
            인원 수를 입력받아서 더치페이를 할 수 있도록 구현

            ex) 100,000원의 음식을 결제하고 팁으로 10퍼센트를 준다면
            11만원의 결제값이 생김
            이를 5명이서 나눈다면 22,000원을 결제하게됨.
         */

        //0. double 사용 X , int 만 사용함
        // 1. 음식 가격을 입력 받아야함. -> 물어보고 입력받음 => scanner 사용
        // 2. 몇 %의 팁을 낼 건지 입력 받아야함.
        // 3. 입력 받은 %에서 /100 연산을 해야함.
        // 4. 3의 결과값 * 1의 결과값을 하게 되면 팁의 가격이 나옴.
        // 5. 1의 결과값 + 4의 결과값을 하게 되면 전체 음식 가격이 산출됨.
        // 6. 인원 수를 입력 받아야함.
        // 7. 5의 결과값 / 6의 결과값 = 팁을 포함한 더치페이 가격이 산출됨.

        //next 쓸 시 바로 스캐너 관련 emmet 나옴.
//        int foodPrice;
//        int percent;
//        int totalPrice; //팁과 음식 가격을 합친 데이터의 변수명
//        int people; //더치페이 할 인원 수
//        int pricePerPerson; // 1인 당 지불해야하는 가격을 나타내는 변수명
//
//        System.out.print("음식의 가격은 얼마입니까? >>> ");
//        foodPrice = scanner.nextInt();
//        System.out.print("몇 %의 팁을 내기를 원하십니까, 10, 12, 15% 중 하나를 선택하세요 >>> ");
//        percent = scanner.nextInt();
//        //totalPrice 를 연산하시오.
//        totalPrice = foodPrice+(foodPrice*percent/100); // percent/100 을 할 경우 0.1 이 나오기 때문에 double 형이 나옴 따라서 값이 안나옴.
//        System.out.print("인원 수를 입력 해 주세요 >>> ");
//        people = scanner.nextInt();
//        pricePerPerson = totalPrice / people;
//        System.out.println("최종적으로 낼 값은 " + pricePerPerson + " 원 입니다.");

        // shift + tab => 역 탭
        // 사용 될 변수 선언
        String logo = """
                
                 ________  __             ______             __                    \s
                /        |/  |           /      \\           /  |                   \s
                $$$$$$$$/ $$/   ______  /$$$$$$  |  ______  $$ |  ______    _______\s
                   $$ |   /  | /      \\ $$ |  $$/  /      \\ $$ | /      \\  /       |
                   $$ |   $$ |/$$$$$$  |$$ |       $$$$$$  |$$ | $$$$$$  |/$$$$$$$/\s
                   $$ |   $$ |$$ |  $$ |$$ |   __  /    $$ |$$ | /    $$ |$$ |     \s
                   $$ |   $$ |$$ |__$$ |$$ \\__/  |/$$$$$$$ |$$ |/$$$$$$$ |$$ \\_____\s
                   $$ |   $$ |$$    $$/ $$    $$/ $$    $$ |$$ |$$    $$ |$$       |
                   $$/    $$/ $$$$$$$/   $$$$$$/   $$$$$$$/ $$/  $$$$$$$/  $$$$$$$/\s
                              $$ |                                                 \s
                              $$ |                                                 \s
                              $$/                                                  \s
                
                """;
        int foodPrice;
        int percent;
        //어제 배운 거 말고 변수 추가함 -> 선언해서 작성하는 이유는 percent를 int 로 고정시킬 경우 수식을 쓰는 방식이 제한됨.
        double percentModified;
        int persons;
        double totalPrice;
        double pricePerperson;
        System.out.println(logo);
        System.out.print("음식의 가격은 얼마입니까? >>> ");
        foodPrice = scanner.nextInt();
        System.out.print("몇 %의 팁을 내기를 원하십니까, 10, 12, 15% 중 하나를 선택하세요 >>> ");
        percent = scanner.nextInt();
        //double 로 percent 를 형 변환
        percentModified = (double)percent /100;
//        System.out.println("percentModified = " + percentModified);
        //산술 연산 또한 가능
        totalPrice = foodPrice * (1 + percentModified);
        System.out.print("몇 명이 지불할 것인가요? >>> ");
        persons = scanner.nextInt();
        pricePerperson = totalPrice / persons;
        //변수 선언을 해당 위치에서 한 이유는 형변환을 위해서는 반드시 pricePerPerson이 초기화되야하기 때문
        int pricePerPersonInt = (int) pricePerperson;
        System.out.println("최종적으로 낼 값은 " + pricePerPersonInt + " 원 입니다.");
    }
}