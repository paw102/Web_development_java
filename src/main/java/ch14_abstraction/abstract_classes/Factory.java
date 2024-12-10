package ch14_abstraction.abstract_classes;
/*
    일반 클래스를 추상 클래스로 바꾸는 명령어 : abstract

    public abstract class 와 같은 식으로 작성함.
 */
public abstract class Factory {
    private  String name;

    // 매개변수 생성자 작성
    public Factory(String name) {
        this.name = name;
    }

    // 추상 메서드 정의
    /*
        추상 메서드를 정의하는 법
        public abstract void
     */
    public abstract void produce(String model); // 추상 메서드 -> 구현부가 존재하지 않음. {} 가 없다는 뜻.
    public abstract void manage();

    // 추상 클래스라도 일반 메서드가 존재할 수 있음.
    // setter / getter 정의

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo(){
        System.out.println("공장의 정보를 출력합니다.\n공장 이름 : " + name);
    }
}
