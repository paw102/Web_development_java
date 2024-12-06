package ch08_methods;

public class ScoreCalculator {
    /*
        총합을 내는 메서드
        오버라이딩을 해서 매개변수 개수를 늘려서 총합 계산

        평군을 내는 메서드
     */

    // 1. 총합을 내는 메서드 :  call4() 유형으로 작성 -> 매개변수 / return 값

    public double calculateSum (double score01, double score02) {
        return score01 + score02;
    }

    // calculateSum() 메서드를 오버로딩하여 매개변수가 3 , 4 ,5 개인 메서드들을 만드시오.

    public  double calculateSum (double score01 , double score02 , double score03) {
        return score01 + score02 + score03;
    }

    public  double calculateSum (double score01 , double score02 , double score03 , double score04) {
        return score01 + score02 + score03 + score04;
    }

    public  double calculateSum (double score01 , double score02 , double score03 , double score04 , double score05) {
        return score01 + score02 + score03 + score04 + score05;
    }

    public double calculateSum2 (double totalScore, double score){
        return totalScore + score;
    }

    // 2. 평균을 내는 메서드 : call4() 유형으로 작성
    public double calculateAvg(double totalScore, int numberOfSubjects){
        return totalScore / numberOfSubjects;
    }


}
