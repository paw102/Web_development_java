package ch11_access_modifiers;

public class StudentAccessModifierMain {
    public static void main(String[] args) {
//        //객체 생성을 기본 생성자를 통해서 할 것
//        StudentAccessModifier student1 = new StudentAccessModifier();
//
//        // setter 를 통해서 데이터 입력
//        student1.setName("안근수");
//        student1.setCode(20241205);
//        student1.setAvg(100);
//
//        //.showInfo() 메서드를 통해서 객체 정보 출력
//        student1.showInfo();

        //새로운 객체를 student2 로 생성하는데 생성 시에 이름을 "내 이름" 으로 만들기
        // 점수는 4.5, 학번은 10101 로 입력하시오. -> 아직 없는 값에 데이터 대입
        StudentAccessModifier student2 = new StudentAccessModifier("박수빈");
        student2.setCode(10101);
        student2.setAvg(4.5);
        student2.showInfo();

        //"내이름" 을 "이일"로 고치시오.   -> 기존에 있는 값에 데이터 재대입
        student2.setName("이일");

        //고친 이름을 콘솔 창에서 확인하기 위해 getter 를 사용하시오. return 문이 정의되어있어
        //출력문을 명시해야함
        System.out.println(student2.getName());

        // 이름이 "이일"로 고쳐졌다면 showInfo() 를 통해 전체 정보를 콘솔에 출력하시오.
        //showInfo() 의 경우 매서드 내에 sout 으로 처리했기 때문에 getter 정보를 출력할 떄와 코드가 다름 주의하셈
        student2.showInfo();
    }
}