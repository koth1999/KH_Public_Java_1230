package 다형성기본;

public class Parent {
    protected int num; // 부모와 자식, 같은 패키지 내에서 접근가능
    public void display(){
        System.out.println("부모 클래스 메소드");
    }
}

class Child extends Parent{
    private int x = 100; // 같은 클래스 내에서만 접근 가능
    public Child(){}
    public void out(){
        System.out.println("부모의 protected num 필드 : "+num);
        System.out.println("자식 클래스의 out() 메소드");
    }
    @Override
    public void display(){
        System.out.println("상속 받아 재정의한 메소드");
    }
}

class Child2 {
    private int y = 200;
    public Child2(){}
    public void out(){

        System.out.println("자식 클래스의 out() 메소드");
    }
    public void display(){
        System.out.println("상속 받아 재정의한 메소드");
    }

}
