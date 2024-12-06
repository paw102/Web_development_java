package ch09_classes;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student(20201651,"박수빈", "A");
        student.ShowInfo();

        Student02 student02 = new Student02("이이");
        Student02 student03 = new Student02(1212414);
        Student02 student04 = new Student02(1212414 , "이삼");
        Student02 student05 = new Student02(1212414 , "이삼", 100.0);
    }
}
