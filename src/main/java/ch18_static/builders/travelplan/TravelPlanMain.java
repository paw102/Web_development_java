package ch18_static.builders.travelplan;
/*
    응용 과제 :
        여행 계획 객체 생성

    다음과 같은 속성을 가진 여행 계획 (TravelPlan) 객체를 생성해야함.
        1. 여행지 (destination) : 파리
        2. 출발일 (departureDate) : 2024-12-17
        3. 귀국일 (returnDate) : 2024-12-26
        4. 여행자 수 (numberOfTravelers) : 2
        5. 호텔 이름 (hotelName) : 아난티코브
        6. 비행편번호 (flightNumber) : AF123

        지시사항
            1. @Builder 및 @ToString 을 이용할 것
            2. 위 속성의 예시에 적어둔 데이터를 기준으로 객체를 생성할 것
            3. 생성된 객체인 travelPlan1 을 sout을 통해 콘솔에 출력할 것.
 */


import ch18_static.builders.TravelPlanNoLombok;

public class TravelPlanMain {
    public static void main(String[] args) {            // 여기서는 new 가 안만들어짐
        TravelPlan travelPlan1 = TravelPlan.builder()   // 이유는 Builder 에서 필수 생성자가 없었기 때문에
                .startDate("2024-12-17")
                .endDate("2024-12-26")
                .destination("파리")
                .numOfPerson(2)
                .hotelName("아난티코브")
                .flightNum("AF123")
                .build();


        TravelPlanNoLombok travelPlan2 = new TravelPlanNoLombok.Builder("파리","2024-12-17")
                .bulid(); // 하지만 TravelPlanNoLombok 과 Builder 에서 final 로 지정한 속성 떄문에
                         //  Builder 생성자를 이용하는 경우 new 와 Builder(잇누들) 로 대문자 Builder 를 사용해야함.

        System.out.println(travelPlan1);
        System.out.println();
    }
}
