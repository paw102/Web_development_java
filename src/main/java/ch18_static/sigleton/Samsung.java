package ch18_static.sigleton;

import lombok.Getter;

public class Samsung {
    // 필드 정의
    @Getter         // 필드 위에 @Getter 를 사용하면 getCompany() 를 만들겠다는 의미
    private String company;
    private int serialNumber;

    // 여기서부터 싱글톤 패턴 작성
    // 1. 스태틱 변수 정의     -> 보통 싱글톤 만들 때 객체명을 instance 로 쓰는 편
    private static Samsung instance = null;

    // 2. 기본 생성자 정의     -> 접근지정자 private 주목
    private Samsung(){
        company = getClass().getSimpleName();   // -> 클래스명을 가지고 오는거
        serialNumber = 20240000;
    }

    // 3. static 메서드 정의 -> 대부분의 경우 getInstance() 로 정의함 // public 정의함
    public static Samsung getInstance() {
        if(instance == null){   // 현재 인스턴스가 없다면 이하의 코드가 실행됨
            instance = new Samsung();   // Samsung 클래스의 객체를 생성해 static 변수인 instance 에 대입
        }
        // 만약에 이상의 조건문이 실행되지 않는다면 이미 instance 가 있다는 의미
        // 즉 getInstance() 메서드는 실행되기만 하면 어쩃든 Samsung 클래스의 객체가
        // return 된다는 사실을 알 수 있음
        return instance;
    }
    public String createSerialNumber(String model){
        return model + "_" + ++serialNumber;
    }
}
