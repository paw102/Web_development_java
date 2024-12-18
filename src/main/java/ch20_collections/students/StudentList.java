package ch20_collections.students;
/*

 */

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    public static void main(String[] args) {
        //  비어있는 List 선언
        List<Student> students = new ArrayList<>();

        //20240001 강미경
        //20240002 강준석
        //20240003 김은수
        //20240004 박경호
        //20240005 박수빈
        // 을 추가

        //  이 방식도 가능은 함. 하지만 이렇게 쓰면 너무 가독성이 떨어짐.
        Student student1 = new Student(20240001, "강미경");
        students.add(student1);

        //  정답
        students.add(new Student(20240001, "강미경"));
        System.out.println(students.get(0));
        students.get(0).setName("박수빈"); //  setter / getter 또한 사용 가능
        System.out.println(students.get(0).getName());
    }
}
