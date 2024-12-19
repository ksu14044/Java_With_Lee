package chapter04;
/*
문제 1. 클래스 생성
 */
class Person {
    String name;
    int age;


    Person(String name, int age) {
        this.name = name;
        this.age = age;
        population++;
    }

    void introduce() {
        System.out.println("안녕하세요, 저는 [" + name + "] 이고, [" + age + "] 살입니다.");
    }

    static int population = 0;

    Person() {
        population++;
    }
}
public class ObjectPractice2 {
    public static void main(String[] args) {
        Person person = new Person("홍길동", 25);
        person.introduce();
        System.out.println(Person.population);
        new Person();
        System.out.println(Person.population);

    }
}
