package ch08_methods;

import java.util.Scanner;

public class ScoreCalc02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ScoreCalculator scoreCalculator = new ScoreCalculator();
        int totalSubjects = 1;
        double score01 = 0;
        double score02;
        double score03 = 0;
        double avgScore = 0;
        double totalScore = 0;
        boolean endOfCalc = false;

        while (!endOfCalc) {

            System.out.print("점수를 입력하세요( 종료하려면 -1을 입력하세요 ) >>> ");
            score01 = scanner.nextDouble();
            if (score01 == -1){
                score01 += 1;
                totalSubjects -= 1;
                endOfCalc = true;
            }
            totalScore = scoreCalculator.calculateSum2(totalScore, score01);
            System.out.println("-----------------최종적으로 한 번만 나오는 합계와 평균입니다------------------ \n현재 과목의 수는 " + totalSubjects + "개 입니다.");


            if(totalSubjects > 0) {
                avgScore = scoreCalculator.calculateAvg(totalScore, totalSubjects);
                System.out.println("입력한 점수의 합계 : " + totalScore + "\n입력한 점수의 평균 : " + avgScore);
            } else {        //totalSubjects <= 0 인 경우
                System.out.println("입력한 점수가 없습니다!!!!!");
            }

            //평균 계산을 끝낸 뒤에 과목 수를 증가시키면됨.
            totalSubjects++;
        }
    }
}
