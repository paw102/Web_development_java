package ch12_arrays;
/*
    while 반복문을 돌려서 5번 로또 번호를 추출을 가능하게 하는 프로그램을 작성할 예정

    1 ~ 45 까지의 숫자를 임의로 생성한 후 lottoNumber 라는 배열에 저장할 거임
    로또 번호 6 -> index 가 6개인 배열 : 게임 한 번
            5개 만들어져야함. -> 총 5000원 어치

         중복 제거와 관련된 부분이 걸릴 수 있음 -> getter / setter 학습한 부분 확인

         실행 예

         로또 번호 추첨기에 오신 것을 환영합니다. 5 게임을 시작합니다. -> '5' 는 String 이 아닐 것.
         이번 로또 당첨 번호는 다음과 같습니다.
         [ 3, 12, 25, 13, 24, 21 ],
         [ 3, 25, 7, 4, 6, 8 ],
         [4, 15, 22, 30, 36, 12],
         ...
 */

import java.util.Arrays;
import java.util.Random;

public class ArrayTest07 {
    public static void main(String[] args) {
        // 필요한 객체 생성
        //  random.nextInt(a) 의 의미 : 0 부터 a-1 까지의 int 를 임의적으로 생성함.
        String logo = """
                
                 /$$        /$$$$$$  /$$$$$$$$ /$$$$$$$$ /$$$$$$\s
                | $$       /$$__  $$|__  $$__/|__  $$__//$$__  $$
                | $$      | $$  \\ $$   | $$      | $$  | $$  \\ $$
                | $$      | $$  | $$   | $$      | $$  | $$  | $$
                | $$      | $$  | $$   | $$      | $$  | $$  | $$
                | $$      | $$  | $$   | $$      | $$  | $$  | $$
                | $$$$$$$$|  $$$$$$/   | $$      | $$  |  $$$$$$/
                |________/ \\______/    |__/      |__/   \\______/\s
                                                                \s
                
                """;
        Random random = new Random();

        // 필요한 변수 생성
        int [] lottoNumbers = new int [6];
        int count = 5; // 횟수에 해당하는 count 변수
        int number;
        boolean duplicate = false;  //  duplicate : 중복 -> false 일 경우에만 lottoNumbers 배열에 element 를 추가하면 됨
        System.out.println(logo);
        System.out.println("로또 번호 추첨기에 오신 것을 환영합니다.");
        System.out.println("이번 로또 추첨 번호는 다음과 같습니다.");
        // lottoNumbers[1]  대입 전에 lottoNumbers[0] 의 중복 체크를 한 후에 다르다면 대입
//        lottoNumbers[0] = random.nextInt(45)+1;
//        number = random.nextInt(45) + 1;
//        if(lottoNumbers[0] == number){
//            // 같으면 한 번 더 random.nextInt()가 있어야함.
//            number = random.nextInt(45)+1;
//        }
//        lottoNumbers[1] = number; // 이 코드가 실행된다면 lottoNumber[0] != number 이기 때문
//        lottoNumbers[2] = random.nextInt(45)+1;
//        lottoNumbers[3] = random.nextInt(45)+1;
//        lottoNumbers[4] = random.nextInt(45)+1;
//        lottoNumbers[5] = random.nextInt(45)+1;


        // 오름 차순을 위한 코드
        Arrays.sort(lottoNumbers);
        // 배열 자체 출력을 위한 코드
        System.out.println(Arrays.toString(lottoNumbers));
    }
}
