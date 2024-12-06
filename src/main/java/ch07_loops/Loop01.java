package ch07_loops;

public class Loop01 {
    public static void main(String[] args) {
        /*
            for문 vs while문

            1. for문

            형식:
            for(시작값; 한계값; 증감값){
                실행문
            }
         */
        //for(웬만하면 처음 선언 및 초기화하는 변수; 한계값; 증감값;) {}
        //시작값 적용 -> 한계값이 있는 부분에서의 true / false 판단 -> 실행문 실행 -> i++ 적용
//        int i = 100;
//        for(i = 0; i < 10; i++){
//            System.out.println(i);
//        }
//        System.out.println("----------------");
//        System.out.println(i);

        /*
            중요함)) 정보처리 기사 문제 출제 빈도 높음.

            시작 지점의 i 를 100으로 선언 및 초기화 하지만
            루프(for문) 쪽의 조건식으로 인해 i 값이 0으로 초기화,
            10까지의 값을 판별하여 조건에 부합하는 값을 내놓기 때문에
            절취선 윗 부분은 0부터 9의 값을,
            절취선 밑부분에 있는 부분은 10으로 출력됨. (이 부분은 판별 최종 값을 내놓음)
            */

        //반복문을 사용하여 1부터 100까지의 합을 나타내시오.
        int result = 0;
        for(int i = 0; i < 101; i++){
            result += i;
        }
        System.out.println("1부터 100까지의 합: " + result);
    }
}
