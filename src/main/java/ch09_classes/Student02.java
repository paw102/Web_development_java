package ch09_classes;
/*
   생성자 getter setter toString equals() hash() 등을 자동생성하는 방법

   메뉴 바 클릭 - code - generate 로 들어가서 해당 메뉴 클릭
   단축키 - alt + insert

   1. alt  - insert
   2. Constructor 클릭
   3. 어떤 필드를 기준으로 생성자를 만들지 체크 (복수 선택 가능)
 */

public class Student02 {
    int studentCode;
    String name;
    Double score;

    public Student02(int studentCode) {
        this.studentCode = studentCode;
    }

    public Student02(String name) {
        this.name = name;
    }

    public Student02(Double score) {
        this.score = score;
    }

    public Student02(int studentCode, String name) {
        this.studentCode = studentCode;
        this.name = name;
    }

    public Student02(int studentCode, String name, Double score) {
        this.studentCode = studentCode;
        this.name = name;
        this.score = score;
    }
}
