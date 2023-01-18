package 추상클래스기본;
// 추상화 : 실체가 없는 부모가 자식에게 상속을 주는 것
// 부모가 선언한 추상 메소드는 자식 클래스에서 반드시 오버라이딩을 해서 기능을 구현해야한다.
public class BasicAbstract {
    public static void main(String[] args) {
        //Animal animal = new Animal();
        Cat cat = new Cat();
        cat.cry();
        Dog dog = new Dog();
        dog.cry();

        Animal animal = new Cat();
        animal.cry();
    }
}
// 추상클래스 : 하나 이상의 추상 메소드를 포함하는 클래스를 의미한다.

abstract class Animal{
    abstract void cry(); // 추상메소드는 구현부가 없다. (;)으로 끝남
}

class Cat extends Animal{
    @Override
    void cry() {
        System.out.println("야옹 야옹");
    }
}

class Dog extends Animal{
    @Override
    void cry() {
        System.out.println("멍멍멍");
    }
}
