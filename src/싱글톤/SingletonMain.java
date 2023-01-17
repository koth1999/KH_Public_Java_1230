package 싱글톤;
// 싱글톤 : 프로그램 전체에서 단 하나의 객체만 만들도록 보장 하는 것
// 스프링 프레임워크의 서블릿 객체 생성 시 사용 된다.
// 사용이유는 메모리 효율에 대한 측면과 데이터 공유의 편리성을 위해 사용
public class SingletonMain {
    public static void main(String[] args) {
        // Singleton singleton = new Singleton(); 객체 생성 불가
        Singleton singleton1 = Singleton.getSingleton(); // 이미 만들어진 있는 싱글톤 객체의 주소를 받아옴
        Singleton singleton2 = Singleton.getSingleton();

        if(singleton1==singleton2){ // 참조가 같음을 의미
            System.out.println("같은 싱글톤 객체 입니다.");
        } else{
            System.out.println("다른 싱글톤 객체 입니다.");
        }
        singleton1.id = 9999;
        singleton1.name = "곰돌이사육사";
        System.out.println(singleton1.id);
        System.out.println(singleton1.name);
        System.out.println(singleton2.id);
        System.out.println(singleton2.name);
    }
}
