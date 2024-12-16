package ch18_static.sigleton;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Factory {
    // 필드 선언
    private String factoryName;

    // 생성자 정의 부분 필요 X (Lombok 사용)
    // 메서드 정의 -> 중요한 점은 return 타입이 String, int  이런게 아니고 클래스 자체로 정의했다는 점임. -> Samsung.java 확인
    public SmartPhone produceSmartPhone(){
        System.out.println(factoryName + " 에서 스마트폰을 생산합니다.");

        String model = "갤럭시S";
        String serial = null;

        // 싱글톤 패턴이 적용 된 Samsung 인스턴스를 가져오기
        Samsung samsung = Samsung.getInstance();    // -> produceSmartPhone() 을 처음 실행할 때서야 처음 Samsung 클래스의
                                                    // 인스턴스가 하나 만들어짐
                                                    // 이후 두번째 produceSmartPhone() 을 실행할 때에는
                                                    // 이미 만들어진 instance 반환됨.
        serial = samsung.createSerialNumber(model);
        SmartPhone smartPhone = new SmartPhone(samsung.getCompany(), model, serial);
        // samsung. 을 치게 될 경우 자동완성으로 getCompany() 가 있음
        // 그 이유는 Samsung.java 를 확인했을 때 company 필드에서만 @Getter 가 적용돼있고 SerialNumber 에는 @Getter 가 없었기 때문
        // 즉, 매번 클래스 단위에 일단 @Data 애너테이션을 적용하는 방식은 비효율적이고 코드 가독성을 떨어트릴 수 있어 명확한 설계 하에
        // 코딩을 할 필요가 있음
        return smartPhone;
    }
}
