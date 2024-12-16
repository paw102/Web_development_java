package ch18_static.sigleton.database;

import javax.xml.crypto.Data;

public class DatabaseMain {
    public static void main(String[] args) {
        //  DataConnection 객체는 여기서 안만들거임.
        //  DataManager.java 에 DatabaseConnection 객체를 하나 만들어내는 코드를 작성해 넣었기 때문임.
        DataManager dataManager1 = new DataManager();

        //  dataManager1 메서드 실행
        dataManager1.performDatabaseOperations();
        System.out.println("-------------------------");

        /*
            data1Manager1.performDatabaseOperations() 의 실행 결과

            데이터베이스를 연결하였습니다.
            데이터베이스 연산을 수행 중
            데이터베이스 연결을 끊었습니다.
         */

        DataManager dataManager2 = new DataManager();
        dataManager2.performDatabaseOperations();

        /*
            dataManager2.performDatabaseOperations(); 의 실행 결과

            dataManager1.performDatabaseOperations()
            데이터베이스를 연결하였습니다.
            데이터베이스 연산을 수행 중
            데이터베이스 연결을 끊었습니다.
            -------------------------
            dataManager2.performDatabaseOperations()
            데이터베이스 연산을 수행 중
            데이터베이스 연결을 끊었습니다.


            왜요?
            dataManager1 을 생성했을 때 DataConnection 의 객체를 만들게 되는데, 이때 싱글톤으로 작성했기 때문에
            dataManager2 의 객체를 생성한다하더라도 기존의 DatabaseConnection 객체를 사용함.
            그 결과 DatabaseConnection 의 생성자는 한 번만 호출됨.

            그래서 dataManager1 의 메서드 실행 결과와 dataManager2 의 메서드 실행 결과와 차이가 나게됨

             1줄 요약
             "싱글톤 사용"
         */
    }
}
