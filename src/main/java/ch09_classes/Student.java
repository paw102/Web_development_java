package ch09_classes;
/*
    학번, 이름, 점수 (ABCDF) field 를 선언함
    기본 생성자
    학번을 매개변수로 하는 생성자
    이름을 매개변수르 하는 생성자
    점수를 매개변수로 하는 생성자
    학번, 이름, 점수를 매개변수로 하는 생성자

    showInfo() 메서드를 정의
    ex)
    학번 : 12144134
    이름 : 이일
    점수 : A 등급

 */

public class Student {
    int snum;
    String name;
    String grade;


    Student(){
        System.out.println("학번 이름 점수 값을 가진 기본 생성자");
    }

    Student(int number){
        this.snum = number;
    }

    Student(String sName){
        this.name = sName;
    }

    Student(int number, String sName, String sGrade){
        this.snum = number;
        this.name = sName;
        this.grade = sGrade;
    }

    //showInfo 선언
    void ShowInfo(){
        System.out.println("학번 : " + snum);
        System.out.println("이름 : " + name);
        System.out.println("점수 : " + grade + " 등급");
    }

}
