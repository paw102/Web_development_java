package ch17_bean;
/*
    Lombok
        자바에서 반복적으로 작성해야 하는 코드 (boilerplate code : 보일러플레이트 코드)를 자동으로 생성해주는
        라이브러리에 해당됨.

        장점 :
            코드의 가독성을 높일 수 있다 -> 주석을 통한 애너테이션을 붙여 코드 생성을 제어 가능
                                        특히 스크롤링해서 setter 가 있는 지 없는 지, 특정한 field 에 대한 getter / setter
                                        의 유무 등 고려할 필요 없이 @ 파트만 보더라도 대략적인 코드의 흐름을 알 수 있음.
       1. @Data
            - @Getter, @Setter, @RequiredArgsConstructor, @ToString, @EqualAndHashCode 애너테이션들을 포한 한 종합 패키지에 해당

       2. @NoArgsConstructor
            - 기본 생성자를 생성

       3. @AllArgsConstructor
            - final 또는 @NonNull 로 지정된 필드를 매개변수로 받는 생성자를 생성함.
               초기화를 강제하기 위한 수단으로 쓰임.

       4. @Getter / @Setter
            - 각 필드에 대해 getter setter 메서드듣을 필드 레벨에 사용하면 특정 필드에 대해서만
               getter / setter 가 생성됨 -> 클래스 레벨에만 적용함

               단, @setter 기준으로 final 필드에는 Setter 가 생성되지 않음.

       5. @EqualAndHashCode
            - equals() 와 hashCode() 메서드를 자동으로 생성 -> 둘이 같이 만들어지기 때문에 묶여서 부름

       6. @toString
            - toString() 메서드를 자동으로 생성. 객체의 필드 값을 문자열로 표현 해 주는 메서드
 */
import lombok.Data;

@Data
public class UserEntityLombok {
    private String username;
    private String password;
    private String email;
    private String name;
}
