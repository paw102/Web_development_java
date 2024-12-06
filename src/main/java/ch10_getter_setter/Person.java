package ch10_getter_setter;

import java.util.Scanner;

public class Person {
    private String name;
    private int age;

    //  기본 생성자, 매개변수 생성자들을 전부 만드시오.
    // PersonMain.java 에서 해당 객체들을 만드시오.
    // Person person1 = new Person();
    // Person person2 = new Person("내 이름");
    // Person person3 = new Person(-100);
    // Person person4 = new Person("사실 난 인간 아님" , 1000);

    //생성자 정의
    Person () {}

    Person (String pName){
        this.name = pName;
    }

    Person (int pAge) {
        this.age = pAge;
    }

    Person (String pName, int pAge) {
        this.name = pName;
        this.age = pAge;
    }

    // Setter / Getter 정의
    // set 변수명() / get 변수명()으로 사용하는 편임.

    // 1. 외부에서 필드에 직접 접근을하지 못하도록 접근지정자를 설정함.

    // 2. Setter 의 구조
    //      메서드에 매개변수가 필수적으로 요구됨 -> 값을 변경하거나 대입 할 argument 가 필요하기 때문
    //      그리고 return 값이 없음 -> void
    public void setName(String newName){
        this.name = newName;
    }

    // 3. Getter 의 구조
    //      데이터를 조회만 하면 되기 때문에 매개변수가 요구되지 않음. 즉 () 형태로 마무리됨.
    //      대신 필드와 동일한 자료형의 return 값이 요구됨 -> void 가 아님.
    public String getName(){
        return name;
    }

    // setAge 와 getAge 를 정의하고
    // person3 의 age 를 20으로 변경하고
    // person4의 name 을 김삼, age 를 30으로 변경한 후, 바뀐 필드들만 콘솔에 출력

    public void setAge(int newAge){


        //method 이기 때문에 {} 내부 코드를 작성할 수 있음.
        // -> 이를 통해 데이터 유효성 검증을 위한 부분을 추가할 수 있음.
        // 조건문을 적용을 하여 0 이상의 값만 입력이 가능하게끔 코드를 작성 + 150 미만의 값 또한 되게끔 추가
        //&& 연산자 사용 -> 여기에 While 문을 붙여서 올바른 값만 입력하게끔 작성
//        if(newAge >= 0 && newAge < 150) {
//            this.age = newAge;
//        } else {
//                System.out.println("다시 입력하셈.");
//        }

//        //중첩 if 문
//        if(newAge >= 0){
//            if(newAge < 150){
//                this.age = newAge;
//            } else {
//            System.out.println("다시 입력하셈.");
//        }
//       }

        //메서드 내에서 사용할 클래스를 import
        Scanner scanner = new Scanner(System.in);
        while (!(newAge >= 0 && newAge < 150)){
            System.out.print("나이는 0 이상 150 미만이어여만 함. 다시 입력하셈 >>> ");
            newAge = scanner.nextInt(); //argument 로 age를 받았지만 값이 적절하지 않기 때문에
                                        // 재입력을 받아서 age 에 재대입하는 과정이 필요함.
        } this.age = newAge;
        System.out.println("나이가 업데이트됨.");
    }

    public int getAge(){
        return age;
    }
}
