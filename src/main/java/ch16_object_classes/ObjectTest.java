package ch16_object_classes;
/*
    모든 클래스는 Object 클래스를 상속 받는다. -> 우리가 정의한 것 말고는 기존에 있는 class 들을 의미함.
 */

public class ObjectTest extends Object{
    private String name;
    private String address;

    // NoArgConstructor 정의

    public ObjectTest() {
    }

    // AllArgsConstructor 정의

    public ObjectTest(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // getter / setter 정의

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // displayInfo() 정의
    // 실행 예
    // 이름 : 박수빈
    // 주소 : 부산광역시 서구
    public void displayInfo(){
        System.out.println("이름 : " + getName());
        System.out.println("주소 : " + getAddress());
    }

    // showInfo() 를 정의하는데 sout 말고 return 형으로 작성 한 후, main 에서 콘솔로 출력하시오.
    public String showInfo(){
        return "이름 : " + name + "\n주소 : " + address;
    }

    // 즉 기본적으로 toString() 이라는 메서드는 어떤 특정한 클래스의 인스턴스를 전부 다 String 형태로 바꿔즈는 것을 의미함.
    // 이는 Object 클래스의 메서드를 Override 했음을 확인 할 수 있음.


    @Override
    public String toString() {
        return "이름 : " + name + "\n주소 : " + address;
    }


}
