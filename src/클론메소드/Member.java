package 클론메소드;

// Cloneable 상속 받아 구현해야할 메소드는 없다
// clone() 메소드는 데이터 보호를 이유로 Cloneable 인터페이스를 구현한 클래스의 인스턴스만 사용 가능
public class Member implements Cloneable{
    String id;
    String name;
    String password;
    int age;
    boolean isAdult;

    public Member(String id, String name, String password, int age, boolean isAdult) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.isAdult = isAdult;
    }
    // 반환 타입이 Member 타입이다
    public Member getMember(){
        Member cloned = null;
        try{
            cloned = (Member) clone(); // 클론 메소드의 반환 타입은 Object이므로 형변환 필요
        } catch(CloneNotSupportedException e){}
        return cloned;
    }
}
