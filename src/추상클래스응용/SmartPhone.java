package 추상클래스응용;

public class SmartPhone extends Phone{
    SmartPhone(String name) {
        super(name);
    }
    @Override
    void call() {
        System.out.println("부모의 요청으로 통화 기능을 완성합니다.");
    }
    void internet(){
        System.out.println("인터넷 기능을 추가 합니다.");
    }
}
