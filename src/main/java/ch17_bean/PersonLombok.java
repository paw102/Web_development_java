package ch17_bean;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

/*
    12 21일 Spring 수업 들어갈 때 다시 할 예정임.
    project 생성 시 maven / gradle 중에서 gradle 을 선택함
        -> build.gradle 파일이 만들어짐.
        -> wrap groovy 로 만들었어야 했는데 kotlin 으로 만들어버리는 바람에
        -> build.gradle.kit 형태로 만들어짐

        lombok '의존성 주입' -> 마찬가지로 의존성 주입에 대한 개념은 spring 에서 배움
        chrome 에서 mvn 검색, 혹은 https://mvnrepository.com 접속
        lombok 검색 -> 가장 상위 패치 선택
        원래 한 방식 (gradle) 파트에서 클릭 후 복사 후
        build.gradle.kits 에서
        dependencies {
            여기에 복붙함
            compileOnly("org.projectlombok:lombok:1.18.36") // lombok 의존성
            annotationProcessor("org.projectlombok:lombok:1.18.36")
            }
        이거 하면 우측 상단에 코끼리 + 새로고침 모양이 뜸. 그거 클릭하면
        lombok 설정이 마무리가 됨. (가끔 오류나는 경우에는 재시작, 그래도 안되면 강사님 호출)
 */
@RequiredArgsConstructor
@AllArgsConstructor
public class PersonLombok {
    private final String name;
    private int age;

//  @ (애너테이션) 사용을 할 경우에 명시적인 생성자로 코드를 작성하게 되면 충돌이 일어나기 때문에 둘 중 하나만 써야함.
//    public PersonLombok(String name) {
//        this.name = name;
//    }
//
//    public PersonLombok(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
}
