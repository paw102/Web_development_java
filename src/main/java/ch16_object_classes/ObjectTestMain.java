package ch16_object_classes;

public class ObjectTestMain {
    public static void main(String[] args) {
        ObjectTest objectTest1  = new ObjectTest("박수빈","부산광역시 서구");
        objectTest1.displayInfo();
        System.out.println((objectTest1.showInfo()));
        System.out.println();

        // 객체 그 자체를 sout 시켰을 때
        System.out.println(objectTest1);
        // 이상과 같이 작성했을 때 주소값(12월 12일 21시 18분 기준)이 출력됨.
    }
}
