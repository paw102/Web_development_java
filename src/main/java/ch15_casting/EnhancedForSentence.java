package ch15_casting;
/*
    향상된 for 문 (Enhanced For Sentence)

    int[] scores = new int []   -> 배열 선언 방법

    향상된 for 문의 형식 :
        자료형 변수명 : 반복가능객체 (주로 배열)
        for(int num : scores) {
            실행문
            System.out.println(num);
        }

     기존 for문:
        for (int i = 0; i < scores.length; i++) {
            실행문
            System.out.println(score[i]);
        }


        for 문을 실행할 때 반복 대상이 있으면 자료형은 반복 대상이 아닌 지닌 자료형 (즉 요소) 와 같은 자료형으로 지정해야함.
        즉, 배열을 선언할 때 지정한 자료형과 꺼낼 자료형이 일치해야 함을 의미함.
        반복 대상 요소를 하나씩 변수에 대입하면서 진행하고, 반복 대상의 길이만큼 꺼내어 반복함.
 */

public class EnhancedForSentence {
    public static void main(String[] args) {
        int[] scores = {100, 90, 95};
        int sum1 = 0;
        int sum2 = 0;

        // 기존 for 문을 통한 요소 출력
//        for (int i = 0; i < scores.length; i++) {
//            System.out.println(scores[i]);
//        }
//
//        // 이상의 코드에서 scores[0] 으로 index 가 지정될 때만 100을 출력할 수 있는 점으로 보아
//        // scores[0] = 100; 이라고 볼 수 있을 것임.
//        System.out.println();
//        // 향상된 for문을 통한 요소 출력
//        for(int score : scores){        // scores 배열 내부의 각 요소들에게 score 이라는 변수명을 대입하여 하나씩 출력하는 코드
//            System.out.println(score);
//        }

        // 기존 for 문을 이용하여 합을 구한 후 sum1 에 대입하여 출력하시오.
        for (int i = 0; i < scores.length; i++) {
            sum1 += scores[i];
        }
        // 향상된 for 문을 이용하여 합을 구한 후 sum2 에 대입하여 출력하시오.
        for(int score : scores){
            sum2 += score;
        }

        System.out.println(sum1);
        System.out.println(sum2);
    }
}
