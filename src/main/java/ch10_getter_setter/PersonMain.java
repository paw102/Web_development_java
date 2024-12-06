package ch10_getter_setter;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person();

        Person person2 = new Person("박수빈");

        Person person3 = new Person(-100);

        Person person4 = new Person("사실 난 인간아님", 1000);

//        System.out.println(person4.name);
//        System.out.println(person4.age);

//        person4.name = "private라 이딴 짓 못함";   -> 이상을 이유로 name 필드에 접근하여 값 변경 또한 불가능

//        person3.setAge(10);
//        System.out.println(person3.getAge());
//
//        person4.setName("김삼");
//        person4.setAge(30);
//        System.out.println(person4.getName() + " " + person4.getAge());

        Person person5 = new Person();
        person5.setAge(200);
        System.out.println(person5.getAge());
    }
}
