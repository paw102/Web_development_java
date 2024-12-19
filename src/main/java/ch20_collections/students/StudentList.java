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
//        Student student1 = new Student(20240001, "강미경");
//        students.add(student1);

        //  정답
        students.add(new Student(20240001, "강미경"));
        students.add(new Student(20240002,"강준석"));
        students.add(new Student(20240003, "김은수"));
        students.add(new Student(20240004,"박경호"));
        students.add(new Student(20240005,"박수빈"));

//        //  추가 후 전체 리스트 출력
//        System.out.println(students);
//        //  0~4번지까지 찾아넣었기 때문에 안덱스 넘버 3에 위치한 요소의 학번 + 2번지에 위치한 요소의 이름을 콘솔 출력
//        System.out.println(students.get(3).getId());
//        System.out.println(students.get(2).getName());

        //  "박수빈" 이름을 가진 객체의 학번을 콘솔에 출력 -> 검색과 관련 있음 StringList.java 확인
        // 향상된 for 문
//        String searchStudents = "박수빈";
//        for (Student student : students){
//            if (searchStudents.equals(student.getName())){
//                System.out.println(student.getId());
//            }
//        }
//
//        //  일반 for 문
//        for (int i = 0; i < students.size(); i++) {
//            if (searchStudents.equals(students.get(i).getName())){  // 문자열을 비교하는 것이기 때문에 == 이 아니라 .equals() 사용
//                System.out.println(students.get(i).getId());
//            }
//        }
//
//        //  20240001 학번을 가진 객체의 이름을 콘솔에 출력 -> 마찬가지로 검색 관련
//        //  향상된 for 문
//        int searchStudents2 = 20240001;
//        for (Student student : students){
//            if (searchStudents2 == student.getId()){
//                System.out.println(student.getName());
//            }
//        }
//
//        //  일반 for 문
//        for (int i = 0; i < students.size(); i++) {
//            if (searchStudents2 == students.get(i).getId()){    //  int 냐 String 이냐에 따른 차이로 조건식 방식이 달라짐.
//                System.out.println(students.get(i).getName());
//            }
//        }
//        System.out.println(students.get(0));
//        students.get(0).setName("박수빈"); //  setter / getter 또한 사용 가능
//        System.out.println(students.get(0).getName());

        //  setName() 메서드 활용
        //  id = 20240002 인 학생을 찾고, 그 학생의 이름이 "강준석" 이라면 "박승주" 로 바꾸기
        int searchId = 20240002;
        String searchName = "강준석";
        //  향상된 for 문
        for(Student student : students){
            if (student.getId() == searchId){
                if (student.getName().equals(searchName)){
                    student.setName("박승주");
                    System.out.println(student.getId() + " " + student.getName());
                    break;
                }
            }
        }

        //  일반 for 문
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == searchId){
                if (students.get(i).getName().equals(searchName)){
                    students.get(i).setName("박승주");
                    break;
                }
                System.out.println(students.get(i).getId()+ " " + students.get(i).getName());
            }
        }

        //  list 의 요소 삭제 방법
        System.out.println("삭제 전 전체 리스트 : " + students);

        //  list 에는 인덱스 넘버가 있기 때문에 인덱스 번호로 삭제 가능
        //  인덱스 넘버 이외에도 특정한 문자열을 가지고 있으면 삭제가 가능함.   -> StringList.java 확인
        students.remove(0);
        System.out.println("삭제 후 전체 리스트 : " + students);


        //  이름이 "김은수" 인 학생 객체를 리스트에서 삭제하는 코드 작성
        //  .remove(Object o) 를 사용하여 삭제
        for (Student student : students){
            if (student.getName().equals("김은수")){
                students.remove(student);
                break;
            }
        }
        System.out.println("김은수 학생 데이터 삭제 후 리스트 : "+students);

        //  인덱스 넘버를 사용하여 삭제하는 방법
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals("김은수")){
                students.remove(i);
                break;
            }
        }
        System.out.println("김은수 학생 데이터 삭제 후 리스트 : "+students);
    }
}
