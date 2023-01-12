package 객체타입확인;
// instanceof : 개체 타입을 확인하는 연산자입니다.
// 상속 관계에서 부모와 자식 관계가 성립하는지 확인하는 용도로 사용
public class InstanceOf {
    public static void main(String[] args) {
        Parent parent = new Parent("부모");
        Child child = new Child("자식");

        System.out.println(parent instanceof Parent);
        System.out.println(child instanceof Parent);
        System.out.println(parent instanceof Child);
        System.out.println(child instanceof Child);
    }
}

class Parent{
    String name;
    Parent(String name){
        this.name = name;
    }
}

class Child extends Parent{
    String name;
    Child(String name){
        super("부모"); // 부모 생성자를 호출
        this.name = name;
    }
}