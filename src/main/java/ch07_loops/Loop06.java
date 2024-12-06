package ch07_loops;

public class Loop06 {
    public static void main(String[] args) {
        /*

                *
               **
              ***
             ****
            *****

            실행문1이 요구되는 패턴
         */
        for(int i = 0; i < 5; i++){
           //공백 영역 + 별의 갯수는 5로 고정되어야함
            //공백이 먼저 나오기 때문에 공백을 처리하는 반복문이 먼저 작성돼야 함.
            for(int j = 4; j > i; j--){ //감소패턴이라고 했기 때문에 j-- 적용
                System.out.print(" ");
            }
            //별이 찍히는 코드
            for(int k = 0; k <= i; k++){
                System.out.print("*");
            }
            //개행이 일어나는 실행문3
            System.out.println();
        }
    }
}
