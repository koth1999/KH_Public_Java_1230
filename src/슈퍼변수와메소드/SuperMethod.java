package 슈퍼변수와메소드;
// super : 자식 클래스가 부모클래스로 부터 상속 받은 필드를 참조할 때 사용하는 참조 변수
public class SuperMethod {
    public static void main(String[] args) {
        System.out.println("메인 메소드 호출");
        Child child = new Child();
        child.display();
    }
}

class Parent{
    int a;
    Parent(){
        a = 10;
        System.out.println("부모 생성자 호출!!!");
    }
    Parent(int n){
        a = n;
    }
}

class Child extends Parent{
    int b;
    Child(){
        b = 20;
        System.out.println("자식 생성자 호출!!!");
    }
    void display(){
        System.out.println(a);
        System.out.println(b);
    }
}
