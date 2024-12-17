package ch18_static.builders;

import ch18_static.builders.travelplan.TravelPlan;

public class TravelPlanNoLombok {
    //  필수 필드
    private final String destination;
    private final String departureDate;
    //  선택 필드
    private String returnDate;
    private int numberOfTravelers;
    private String hotelName;
    private String flightNumber;

    //  private 을 통한 TravelPlanNoLombok
    private TravelPlanNoLombok(Builder builder){
        this.destination = builder.destination;
        this.departureDate = builder.departureDate;
        this.returnDate = builder.returnDate;
        this.numberOfTravelers = builder.numberOfTravelers;
        this.hotelName = builder.hotelName;
        this.flightNumber = builder.flightNumber;
    }

    // TravelPlanNOLombok 의 내부 클래스 Builder 정의
    public static class Builder{
        // 필수 필드 선언
        private final String destination;
        private final String departureDate;

        //  선택 필드 선언
        private String returnDate;
        private int numberOfTravelers;
        private String hotelName;
        private String flightNumber;

        //  final 로 선언한 애들은 기본적으로 RequiredArgsConstructor 에 해당함 -> 메서드가 아니라 생성자임
        public Builder(String destination, String departureDate){
            this.destination = destination;
            this.departureDate = departureDate;
        }

        // 선택 필드와 관련된 메서드 정의
        public Builder returnDate (String returnDate){
            this.returnDate = returnDate;
            return this;
        }

        public Builder numberOfTravelers(int numberOfTravelers){
            this.numberOfTravelers = numberOfTravelers;
            return this;
        }

        public Builder hotelName(String hotelName){
            this.hotelName = hotelName;
            return this;
        }

        public Builder flightNumber(String flightNumber){
            this.flightNumber = flightNumber;
            return this;
        }

        public TravelPlanNoLombok bulid(){
            return new TravelPlanNoLombok(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "destination='" + destination + '\'' +
                    ", departureDate='" + departureDate + '\'' +
                    ", returnDate='" + returnDate + '\'' +
                    ", numberOfTravelers=" + numberOfTravelers +
                    ", hotelName='" + hotelName + '\'' +
                    ", flightNumber='" + flightNumber + '\'' +
                    '}';
        }
    }
}
