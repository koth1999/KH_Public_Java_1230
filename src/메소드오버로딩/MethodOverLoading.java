package 메소드오버로딩;
// 객체지향 언어의 4대특징 : 상속, 데이터은닉, 다형성(오버로딩, 오버라이딩), 추상화
// 메소드 오버로딩 : 같은 이름의 메소드를 중복하여 정의하는 것을 의미
// 메소드 오버로딩의 가능한 조건
// 1. 메소드 이름이 같아야함
// 2. 반환타입은 해당사항이 없음
// 3. 매개변수의 타입이 다르거나, 개수가 다르거나, 순서가 다르면 가능
public class MethodOverLoading {
    public static void main(String[] args) {
        System.out.println(sum(100,200));
        System.out.println(sum(100,"200", 300));
        System.out.println(sum("seoul","busan","incheon"));
        System.out.println(sum(100, 200, 300, 400));
    }

    static int sum(int x, int y){
        return x+y;
    }
    // 매개변수의 개수가 다름
    static int sum(int x, int y, int z){
        return x+y+z;
    }
    // 매개변수의 타입이 다름
    static String sum(int x, String y, int z){
        return x+y+z;
    }
    // 반환타입은 오버로딩 규칙과 상관없으며, 매개변수의 개수가 다름
    static double sum(int x, int y, int z, int aa){
        return (double)(x+y+z+aa);
    }
    // 매개변수의 순서가 다름
    static String sum(String x, int y, int z){
        return x+y+z;
    }
    static String sum(String x, String y, String z){
        return x+y+z;
    }
}
