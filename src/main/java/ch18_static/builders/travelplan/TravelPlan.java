package ch18_static.builders.travelplan;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class TravelPlan {
    private String destination;
    private String startDate;
    private String endDate;
    private int numOfPerson;
    private String hotelName;
    private String flightNum;
}
