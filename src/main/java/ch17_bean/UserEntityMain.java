package ch17_bean;

public class UserEntityMain {
    public static void main(String[] args) {
        UserEntityLombok user1 = new UserEntityLombok();

        /*
            username 에 abcdef
            password 에 1234
            email 에 a@test.com
            name 에 이름 넣은 후에 출력
         */

        user1.setPassword("1234");
        user1.setEmail("a@test.com");
        user1.setUsername("abcdef");
        user1.setName("박수빈");

        // 이하의 코드에서 알 수 있는 것 : @Data 애너테이션 내부에는 toString() 메서드가 구현되어있음.
    }
}
