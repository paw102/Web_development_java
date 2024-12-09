package ch12_arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayLotto {
    public static void main(String[] args) {
        Random random = new Random();
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

        int [] lottoNumbers = new int [6];
        int count = 5;
        int number;
        boolean duplicate = false;
        System.out.println(logo);
        System.out.println("로또 번호 추첨기에 오신 것을 환영합니다.");
        System.out.println("이번 로또 추첨 번호는 다음과 같습니다.");

        while (count > 0){
            // 일단 1 게임을 완성하는 코드
            for (int i = 0; i < lottoNumbers.length; i++) {
                //반복문이 돌 때마다 duplicate = false 로 초기화 시켜야 할 것 같음.
                duplicate = false;
                // 배열에 값을 대입하기 전에 임시 변수인 number에 대입 후 중복 확인하고 중복되지 않는다면 이후에 lottoNumber 배열에 데이터를 대입
                number = random.nextInt(45)+1;
                for (int j = 0; j < i; j++) {   // 한계값 j < lottoNumbers.length 사용 X
                    //  중복을 확인하는 코드
                    if (lottoNumbers[j] == number) {
                        duplicate = true;
                        break;
                    }
                }

                // 중복이 되지 않으면 if 부분이 실행돼서 배열에 값을 대입
                // 중복이 된다면 else 부분이 실행됨 -> 이 경우 다시 한번 random.nextInt() 를 실행해야하기 때문에 i-- 를 했음.
                if(!duplicate){
                    lottoNumbers[i] = number;
                } else {
                    i--;
                }
            }

            // 오름 차순을 위한 코드
            Arrays.sort(lottoNumbers);
            // 배열 자체 출력을 위한 코드
            System.out.println(Arrays.toString(lottoNumbers));
            count--;
        }









    }
}
