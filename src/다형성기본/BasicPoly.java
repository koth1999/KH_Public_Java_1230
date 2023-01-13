package 다형성기본;
// 부모클래스의 타입의 참조변수로 자식클래스의 인스턴스를 참조
// 단, 부모클래스에서 존재하는 메소드만 접근가능
public class BasicPoly {
    public static void main(String[] args) {
        Child child = new Child(); // 자식 클래스의 참조변수로 자식 클래스의 인스턴스(객체) 참조
        child.display();
        child.out();

        Parent parent = new Child();
        parent.display();
        ((Child)parent).out(); // 형변환으로 접근

    }
}
