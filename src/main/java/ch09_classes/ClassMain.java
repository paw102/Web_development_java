package ch09_classes;

public class ClassMain {
    public static void main(String[] args) {
        ClassA a1 = new ClassA();   //Scanner 때와 유사
        //이상의 코드는 여태까지 SCanner 에서 해왔지만 명시적으로 설명하지 않았던 객체 생성 방식에 해당함.

        a1.name = "박수빈"; // 객체명.멤버변수명 = 데이터값 -> a1 객체의 멤버변수 name 에 "박수빈"을 대입

        a1.callName(); // 객체명.메서드명() 를 통해 CLassA 클래스 객체 a1의 메서드 활용

        //  새로운 객체 생성
        ClassA a2 = new ClassA();
        a2.name = "빈수박";

        a2.callName();
    }
}
