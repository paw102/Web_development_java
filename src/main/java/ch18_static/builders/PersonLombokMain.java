package ch18_static.builders;

public class PersonLombokMain {
    public static void main(String[] args) {
//        PersonLombok personLombok1 = PersonLombok.builder()          // 직접 짰다는 의미 (바닐라)
//                .name("김일")                                        // 바닐라로 썼을 때와 달리 @Builder 로 이용했을 때에는
//                .build();                                           //  builder.build() 임 (대문자아님)
//
//
//        PersonLombok personLombok2 = PersonLombok.builder()
//                .name("김이")
//                .age(20)
//                .build();
//
//        PersonLombok personLombok3 = PersonLombok.builder()
//                .name("김삼")
//                .address("서울특별시 종로구")
//                .build();
//
//        PersonLombok personLombok4 = PersonLombok.builder()
//                .name("김사")
//                .age(21)
//                .address("부산광역시 북구")
//                .build();
//
//        PersonLombok personLombok5 = PersonLombok.builder()
//                .address("부산광역시 서구")
//                .age(24)
//                .name("박수빈")
//                .build();
//
//        System.out.println(personLombok1);
//        System.out.println(personLombok2);
//        System.out.println(personLombok3);
//        System.out.println(personLombok4);
//        System.out.println(personLombok5);

        PersonLombok personLombok6 = PersonLombok.builder()
                .name("김육")
                .build();
    }
}
