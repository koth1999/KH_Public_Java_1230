package 중첩클래스;

public class NestedMain {
    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
        b.testMethod();
    }
}

class A {
    class B {
        void testMethod(){
            System.out.println("중첩 클래스의 메소드 입니다.");
        }
    }
}